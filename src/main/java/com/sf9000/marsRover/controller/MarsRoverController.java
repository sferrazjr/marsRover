package com.sf9000.marsRover.controller;

import com.sf9000.marsRover.business.MarsMissionExecution;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergio on 6/23/17.
 */
@RestController
@RequestMapping(value = "/marsRoverService")
public class MarsRoverController {

    @RequestMapping(value = "/move", method = RequestMethod.POST)
    public ResponseEntity<String> move(@RequestPart("file") MultipartFile uploadedFile) throws IOException {

        BufferedReader br = null;
        List<String> inputs = new ArrayList<>();

        String line;
        try {

            br = new BufferedReader(new InputStreamReader(uploadedFile.getInputStream()));
            while ((line = br.readLine()) != null) {
                inputs.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        MarsMissionExecution mmi = new MarsMissionExecution(inputs);

        return new ResponseEntity(mmi.executeMission(), HttpStatus.OK);
    }

}

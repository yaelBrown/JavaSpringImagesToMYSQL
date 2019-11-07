package com.example.javaspringimagestomysql.controllers;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@Controller
public class ImageController {

    @GetMapping("/images")
    public String showUploadImagesForm() {
        return "upload";
    }

    @GetMapping("/images/{id}/show")
    @ResponseBody
    public String showImage(@PathVariable String id) {
        return "Showing image with id of " + id;
    }

    @PostMapping("/images/upload")
    public String

    @RequestMapping(value = "/images/upload", method = RequestMethod.GET,
            produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage() throws IOException {

        ClassPathResource imgFile = new ClassPathResource("image/rkelly.png");
        byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(bytes);
    }
}

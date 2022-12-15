package controller;

import dto.versionDto;
import service.impl.versionManagementServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versionManagementController {
    @GetMapping("/version-data")
    public versionDto getVersionData(){
        return new versionManagementServiceImpl().getVersionData();
    }
}



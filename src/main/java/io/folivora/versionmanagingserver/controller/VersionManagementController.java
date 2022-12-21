package io.folivora.versionmanagingserver.controller;

import io.folivora.versionmanagingserver.dto.VersionDto;
import io.folivora.versionmanagingserver.service.impl.VersionManagementServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionManagementController {

    @GetMapping("/version-data")
    public VersionDto getVersionData() {
        System.out.println("test");
        return new VersionManagementServiceImpl().getVersionData();

    }
}



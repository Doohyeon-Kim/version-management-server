package io.folivora.versionmanagingserver.service.impl;

import io.folivora.versionmanagingserver.dto.VersionDto;
import io.folivora.versionmanagingserver.service.VersionManagementService;
import org.springframework.stereotype.Service;


@Service
public class VersionManagementServiceImpl implements VersionManagementService {
    @Override
    public VersionDto getVersionData() {
        VersionDto versionDto = new VersionDto();
        versionDto.setVersion("1.2.1");
        versionDto.setDescription("Updated Something");
        versionDto.setWindowsFileName("in_app_update_test.exe");
        return versionDto;
    }
}

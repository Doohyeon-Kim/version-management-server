package service.impl;

import dto.versionDto;
import org.springframework.stereotype.Service;
import service.versionManagementService;


@Service
public class versionManagementServiceImpl implements versionManagementService {
    @Override
    public versionDto getVersionData() {
        versionDto versionDto = new versionDto();
        versionDto.setVersion("1.2.1");
        versionDto.setDescription("Updated Something");
        versionDto.setWindowsFileName("in_app_update_test.exe");
        return versionDto;
    }
}

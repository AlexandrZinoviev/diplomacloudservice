package ru.netology.diplomacloudservice.services.file;

import org.springframework.web.multipart.MultipartFile;
import ru.netology.diplomacloudservice.dto.ChangeFilenameRequest;
import ru.netology.diplomacloudservice.dto.FileListResponse;
import ru.netology.diplomacloudservice.entity.User;


import java.io.IOException;
import java.security.Principal;
import java.util.List;

public interface FileService {
    User findUserByName(Principal user);
    void saveFile(Principal user, String filename, MultipartFile multipartFile) throws IOException;
    void deleteFile(Principal user, String filename);
    byte[] getFile(Principal user, String filename);
    void putFile(Principal user, String filename, ChangeFilenameRequest request);
    List<FileListResponse> getFiles(Integer limit);
    void validFileName(String filename);
}
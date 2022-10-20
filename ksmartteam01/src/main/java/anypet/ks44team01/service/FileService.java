package anypet.ks44team01.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import anypet.ks44team01.dto.FileDto;
import anypet.ks44team01.mapper.FileMapper;
import anypet.ks44team01.util.FileUtil;

@Service
@Transactional
public class FileService {
	private FileUtil fileUtil;
	private FileMapper fileMapper;
	
	public FileService(FileUtil fileUtil, FileMapper fileMapper) {
		this.fileUtil = fileUtil;
		this.fileMapper = fileMapper;
	}
	
	//파일 업로드
	public void fileUpload(MultipartFile[] uploadfile, String fileRealPath, boolean isLocalhost) {
		List<FileDto> fileList = fileUtil.parseFileInfo(uploadfile, fileRealPath, isLocalhost);
		if(fileList != null) fileMapper.addFile(fileList);
	}
}

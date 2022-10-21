package anypet.ks44team01.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import anypet.ks44team01.dto.FileDto;

@Mapper
public interface FileMapper {
	public int addFile(List<FileDto> fileList);
}

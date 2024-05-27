package com.vn.htl.back_end.service;

import com.vn.htl.back_end.model.Room;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

@Service
public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
    List<Room> getAllRooms();
    List<String> getAllRoomTypes();

    byte[] getRoomPhotoByRoomId(Long roomId) throws SQLException;
}
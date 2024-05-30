package com.vn.htl.back_end.service;

import com.vn.htl.back_end.model.BookedRoom;
import com.vn.htl.back_end.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService implements IBookingService {
    private final BookingRepository bookingRepository;
    private final IRoomService roomService;
    @Override
    public void cancelBooking(Long bookingId) {
        bookingRepository.deleteById(bookingId);
    }

    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return null;
    }

    @Override
    public String saveBooking(Long roomId, BookedRoom bookingRequest) {
        return "";
    }

    @Override
    public BookedRoom findByBookingConfirmationCode(String confirmationCode) {
        return null;
    }

    @Override
    public List<BookedRoom> getAllBookings() {
        return List.of();
    }

    @Override
    public List<BookedRoom> getBookingsByUserEmail(String email) {
        return List.of();
    }
}

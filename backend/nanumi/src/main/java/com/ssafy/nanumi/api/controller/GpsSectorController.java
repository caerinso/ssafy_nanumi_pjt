//package com.ssafy.nanumi.api.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.simp.SimpAttributesContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@RequiredArgsConstructor
//@RequestMapping("accounts")
//@Controller
//public class GpsSectorController {
//    private final GpsService gpsService;
//
//    @MessageMapping("/sector")
//    public void sector(@Header("simpSessionId") String sessionId, SectorDTO DTO) {
//        // gps 데이터 전달받음
//        // 해당 HashMap에서 이전 섹터 삭제, 새 섹터 입력
//        // 5s 전체채팅 요청
//        System.out.println(DTO.getBeforeGpsKey() + " / " + DTO.getNowGpsKey() + " / " + sessionId + " / " + DTO.getPair());
//        gpsService.changeUserSector(DTO.getBeforeGpsKey(), DTO.getNowGpsKey(), sessionId, DTO.getPair());
//        SimpAttributesContextHolder.currentAttributes().setAttribute("GPS", DTO.getNowGpsKey());
//    }
//
//    @MessageMapping("/emoji")
//    public void sector(@Header("simpSessionId") String sessionId, EmojiDTO DTO) {
//        // 해당 HashMap에서 섹터 -> pk -> 이모지 수정
//        // 5s 전체채팅 요청
//        gpsService.changeUserEmoji(DTO.getGpsKey(), sessionId, DTO.getEmojiURL());
//    }
//
//    @MessageMapping("/disconnect")
//    public void disconnect(String test) {
//        System.out.println(test);
////        gpsService.dropUser(gpsKey, sessionId);
//    }
////    public void disconnect(EmojiDTO DTO) {
////        System.out.println("DISCONNECT");
////        gpsRepository.dropUser(DTO.getGpsKey(), DTO.getUuid());
////        gpsDataSendScheduler.setOperationCommand();
////    }
//}
//

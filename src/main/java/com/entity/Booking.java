package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "booking_id")
	private int booking_id;
	
	@Column(name="movie_id")
	private int movie_id;
	
	@Column(name="show_date")
	private Date show_date;
	
	@Column(name="show_time")
	private String show_time;
	
	@Column(name = "seat_no1")
	private boolean seat_no1;

	@Column(name = "seat_no2")
	private boolean seat_no2;
	
	@Column(name = "seat_no3")
	private boolean seat_no3;
	
	@Column(name = "seat_no4")
	private boolean seat_no4;
	
	@Column(name = "seat_no5")
	private boolean seat_no5;
	
	@Column(name = "seat_no6")
	private boolean seat_no6;
	
	@Column(name = "seat_no7")
	private boolean seat_no7;
	
	@Column(name = "seat_no8")
	private boolean seat_no8;
	
	@Column(name = "seat_no9")
	private boolean seat_no9;
	
	@Column(name = "seat_no10")
	private boolean seat_no10;
	
	@Column(name = "seat_no11")
	private boolean seat_no11;
	
	@Column(name = "seat_no12")
	private boolean seat_no12;
	
	@Column(name = "seat_no13")
	private boolean seat_no13;
	
	@Column(name = "seat_no14")
	private boolean seat_no14;
	
	@Column(name = "seat_no15")
	private boolean seat_no15;
	
	@Column(name = "seat_no16")
	private boolean seat_no16;
	
	@Column(name = "seat_no17")
	private boolean seat_no17;
	
	@Column(name = "seat_no18")
	private boolean seat_no18;
	
	@Column(name = "seat_no19")
	private boolean seat_no19;
	
	@Column(name = "seat_no20")
	private boolean seat_no20;
	
	@Column(name = "seat_no21")
	private boolean seat_no21;
	
	@Column(name = "seat_no22")
	private boolean seat_no22;
	
	@Column(name = "seat_no23")
	private boolean seat_no23;
	
	@Column(name = "seat_no24")
	private boolean seat_no24;
	
	@Column(name = "seat_no25")
	private boolean seat_no25;
	
	@Column(name = "seat_no26")
	private boolean seat_no26;
	
	@Column(name = "seat_no27")
	private boolean seat_no27;
	
	@Column(name = "seat_no28")
	private boolean seat_no28;
	
	@Column(name = "seat_no29")
	private boolean seat_no29;
	
	@Column(name = "seat_no30")
	private boolean seat_no30;
	
	@Column(name = "seat_no31")
	private boolean seat_no31;
	
	@Column(name = "seat_no32")
	private boolean seat_no32;
	
	@Column(name = "seat_no33")
	private boolean seat_no33;
	
	@Column(name = "seat_no34")
	private boolean seat_no34;
	
	@Column(name = "seat_no35")
	private boolean seat_no35;
	
	@Column(name = "seat_no36")
	private boolean seat_no36;
	
	@Column(name = "seat_no37")
	private boolean seat_no37;
	
	@Column(name = "seat_no38")
	private boolean seat_no38;
	
	@Column(name = "seat_no39")
	private boolean seat_no39;
	
	@Column(name = "seat_no40")
	private boolean seat_no40;
	
	@Column(name = "seat_no41")
	private boolean seat_no41;
	
	@Column(name = "seat_no42")
	private boolean seat_no42;
	
	@Column(name = "seat_no43")
	private boolean seat_no43;
	
	@Column(name = "seat_no44")
	private boolean seat_no44;
	
	@Column(name = "seat_no45")
	private boolean seat_no45;
	
	@Column(name = "seat_no46")
	private boolean seat_no46;
	
	@Column(name = "seat_no47")
	private boolean seat_no47;
	
	@Column(name = "seat_no48")
	private boolean seat_no48;
	
	@Column(name = "seat_no49")
	private boolean seat_no49;
	
	@Column(name = "seat_no50")
	private boolean seat_no50;
	
	@Column(name = "seat_no51")
	private boolean seat_no51;
	
	@Column(name = "seat_no52")
	private boolean seat_no52;
	
	@Column(name = "seat_no53")
	private boolean seat_no53;
	
	@Column(name = "seat_no54")
	private boolean seat_no54;
	
	@Column(name = "seat_no55")
	private boolean seat_no55;
	
	@Column(name = "seat_no56")
	private boolean seat_no56;
	
	@Column(name = "seat_no57")
	private boolean seat_no57;
	
	@Column(name = "seat_no58")
	private boolean seat_no58;
	
	@Column(name = "seat_no59")
	private boolean seat_no59;
	
	@Column(name = "seat_no60")
	private boolean seat_no60;
	
	@Column(name = "seat_no61")
	private boolean seat_no61;
	
	@Column(name = "seat_no62")
	private boolean seat_no62;
	
	@Column(name = "seat_no63")
	private boolean seat_no63;
	
	@Column(name = "seat_no64")
	private boolean seat_no64;
	
	@Column(name = "seat_no65")
	private boolean seat_no65;
	
	@Column(name = "seat_no66")
	private boolean seat_no66;
	
	@Column(name = "seat_no67")
	private boolean seat_no67;
	
	@Column(name = "seat_no68")
	private boolean seat_no68;
	
	@Column(name = "seat_no69")
	private boolean seat_no69;
	
	@Column(name = "seat_no70")
	private boolean seat_no70;
	
	@Column(name = "seat_no71")
	private boolean seat_no71;
	
	@Column(name = "seat_no72")
	private boolean seat_no72;
	
	@Column(name = "seat_no73")
	private boolean seat_no73;
	
	@Column(name = "seat_no74")
	private boolean seat_no74;
	
	@Column(name = "seat_no75")
	private boolean seat_no75;
	
	@Column(name = "seat_no76")
	private boolean seat_no76;
	
	@Column(name = "seat_no77")
	private boolean seat_no77;
	
	@Column(name = "seat_no78")
	private boolean seat_no78;
	
	@Column(name = "seat_no79")
	private boolean seat_no79;
	
	@Column(name = "seat_no80")
	private boolean seat_no80;
	
	@Column(name = "seat_no81")
	private boolean seat_no81;
	
	@Column(name = "seat_no82")
	private boolean seat_no82;
	
	@Column(name = "seat_no83")
	private boolean seat_no83;
	
	@Column(name = "seat_no84")
	private boolean seat_no84;
	
	@Column(name = "seat_no85")
	private boolean seat_no85;
	
	@Column(name = "seat_no86")
	private boolean seat_no86;
	
	@Column(name = "seat_no87")
	private boolean seat_no87;
	
	@Column(name = "seat_no88")
	private boolean seat_no88;
	
	@Column(name = "seat_no89")
	private boolean seat_no89;
	
	@Column(name = "seat_no90")
	private boolean seat_no90;

	@Column(name = "seat_no91")
	private boolean seat_no91;
	
	@Column(name = "seat_no92")
	private boolean seat_no92;
	
	@Column(name = "seat_no93")
	private boolean seat_no93;
	
	@Column(name = "seat_no94")
	private boolean seat_no94;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}

	public Date getShow_date() {
		return show_date;
	}

	public void setShow_date(Date show_date) {
		this.show_date = show_date;
	}

	public String getShow_time() {
		return show_time;
	}

	public void setShow_time(String show_time) {
		this.show_time = show_time;
	}

	public boolean isSeat_no1() {
		return seat_no1;
	}

	public void setSeat_no1(boolean seat_no1) {
		this.seat_no1 = seat_no1;
	}

	public boolean isSeat_no2() {
		return seat_no2;
	}

	public void setSeat_no2(boolean seat_no2) {
		this.seat_no2 = seat_no2;
	}

	public boolean isSeat_no3() {
		return seat_no3;
	}

	public void setSeat_no3(boolean seat_no3) {
		this.seat_no3 = seat_no3;
	}

	public boolean isSeat_no4() {
		return seat_no4;
	}

	public void setSeat_no4(boolean seat_no4) {
		this.seat_no4 = seat_no4;
	}

	public boolean isSeat_no5() {
		return seat_no5;
	}

	public void setSeat_no5(boolean seat_no5) {
		this.seat_no5 = seat_no5;
	}

	public boolean isSeat_no6() {
		return seat_no6;
	}

	public void setSeat_no6(boolean seat_no6) {
		this.seat_no6 = seat_no6;
	}

	public boolean isSeat_no7() {
		return seat_no7;
	}

	public void setSeat_no7(boolean seat_no7) {
		this.seat_no7 = seat_no7;
	}

	public boolean isSeat_no8() {
		return seat_no8;
	}

	public void setSeat_no8(boolean seat_no8) {
		this.seat_no8 = seat_no8;
	}

	public boolean isSeat_no9() {
		return seat_no9;
	}

	public void setSeat_no9(boolean seat_no9) {
		this.seat_no9 = seat_no9;
	}

	public boolean isSeat_no10() {
		return seat_no10;
	}

	public void setSeat_no10(boolean seat_no10) {
		this.seat_no10 = seat_no10;
	}

	public boolean isSeat_no11() {
		return seat_no11;
	}

	public void setSeat_no11(boolean seat_no11) {
		this.seat_no11 = seat_no11;
	}

	public boolean isSeat_no12() {
		return seat_no12;
	}

	public void setSeat_no12(boolean seat_no12) {
		this.seat_no12 = seat_no12;
	}

	public boolean isSeat_no13() {
		return seat_no13;
	}

	public void setSeat_no13(boolean seat_no13) {
		this.seat_no13 = seat_no13;
	}

	public boolean isSeat_no14() {
		return seat_no14;
	}

	public void setSeat_no14(boolean seat_no14) {
		this.seat_no14 = seat_no14;
	}

	public boolean isSeat_no15() {
		return seat_no15;
	}

	public void setSeat_no15(boolean seat_no15) {
		this.seat_no15 = seat_no15;
	}

	public boolean isSeat_no16() {
		return seat_no16;
	}

	public void setSeat_no16(boolean seat_no16) {
		this.seat_no16 = seat_no16;
	}

	public boolean isSeat_no17() {
		return seat_no17;
	}

	public void setSeat_no17(boolean seat_no17) {
		this.seat_no17 = seat_no17;
	}

	public boolean isSeat_no18() {
		return seat_no18;
	}

	public void setSeat_no18(boolean seat_no18) {
		this.seat_no18 = seat_no18;
	}

	public boolean isSeat_no19() {
		return seat_no19;
	}

	public void setSeat_no19(boolean seat_no19) {
		this.seat_no19 = seat_no19;
	}

	public boolean isSeat_no20() {
		return seat_no20;
	}

	public void setSeat_no20(boolean seat_no20) {
		this.seat_no20 = seat_no20;
	}

	public boolean isSeat_no21() {
		return seat_no21;
	}

	public void setSeat_no21(boolean seat_no21) {
		this.seat_no21 = seat_no21;
	}

	public boolean isSeat_no22() {
		return seat_no22;
	}

	public void setSeat_no22(boolean seat_no22) {
		this.seat_no22 = seat_no22;
	}

	public boolean isSeat_no23() {
		return seat_no23;
	}

	public void setSeat_no23(boolean seat_no23) {
		this.seat_no23 = seat_no23;
	}

	public boolean isSeat_no24() {
		return seat_no24;
	}

	public void setSeat_no24(boolean seat_no24) {
		this.seat_no24 = seat_no24;
	}

	public boolean isSeat_no25() {
		return seat_no25;
	}

	public void setSeat_no25(boolean seat_no25) {
		this.seat_no25 = seat_no25;
	}

	public boolean isSeat_no26() {
		return seat_no26;
	}

	public void setSeat_no26(boolean seat_no26) {
		this.seat_no26 = seat_no26;
	}

	public boolean isSeat_no27() {
		return seat_no27;
	}

	public void setSeat_no27(boolean seat_no27) {
		this.seat_no27 = seat_no27;
	}

	public boolean isSeat_no28() {
		return seat_no28;
	}

	public void setSeat_no28(boolean seat_no28) {
		this.seat_no28 = seat_no28;
	}

	public boolean isSeat_no29() {
		return seat_no29;
	}

	public void setSeat_no29(boolean seat_no29) {
		this.seat_no29 = seat_no29;
	}

	public boolean isSeat_no30() {
		return seat_no30;
	}

	public void setSeat_no30(boolean seat_no30) {
		this.seat_no30 = seat_no30;
	}

	public boolean isSeat_no31() {
		return seat_no31;
	}

	public void setSeat_no31(boolean seat_no31) {
		this.seat_no31 = seat_no31;
	}

	public boolean isSeat_no32() {
		return seat_no32;
	}

	public void setSeat_no32(boolean seat_no32) {
		this.seat_no32 = seat_no32;
	}

	public boolean isSeat_no33() {
		return seat_no33;
	}

	public void setSeat_no33(boolean seat_no33) {
		this.seat_no33 = seat_no33;
	}

	public boolean isSeat_no34() {
		return seat_no34;
	}

	public void setSeat_no34(boolean seat_no34) {
		this.seat_no34 = seat_no34;
	}

	public boolean isSeat_no35() {
		return seat_no35;
	}

	public void setSeat_no35(boolean seat_no35) {
		this.seat_no35 = seat_no35;
	}

	public boolean isSeat_no36() {
		return seat_no36;
	}

	public void setSeat_no36(boolean seat_no36) {
		this.seat_no36 = seat_no36;
	}

	public boolean isSeat_no37() {
		return seat_no37;
	}

	public void setSeat_no37(boolean seat_no37) {
		this.seat_no37 = seat_no37;
	}

	public boolean isSeat_no38() {
		return seat_no38;
	}

	public void setSeat_no38(boolean seat_no38) {
		this.seat_no38 = seat_no38;
	}

	public boolean isSeat_no39() {
		return seat_no39;
	}

	public void setSeat_no39(boolean seat_no39) {
		this.seat_no39 = seat_no39;
	}

	public boolean isSeat_no40() {
		return seat_no40;
	}

	public void setSeat_no40(boolean seat_no40) {
		this.seat_no40 = seat_no40;
	}

	public boolean isSeat_no41() {
		return seat_no41;
	}

	public void setSeat_no41(boolean seat_no41) {
		this.seat_no41 = seat_no41;
	}

	public boolean isSeat_no42() {
		return seat_no42;
	}

	public void setSeat_no42(boolean seat_no42) {
		this.seat_no42 = seat_no42;
	}

	public boolean isSeat_no43() {
		return seat_no43;
	}

	public void setSeat_no43(boolean seat_no43) {
		this.seat_no43 = seat_no43;
	}

	public boolean isSeat_no44() {
		return seat_no44;
	}

	public void setSeat_no44(boolean seat_no44) {
		this.seat_no44 = seat_no44;
	}

	public boolean isSeat_no45() {
		return seat_no45;
	}

	public void setSeat_no45(boolean seat_no45) {
		this.seat_no45 = seat_no45;
	}

	public boolean isSeat_no46() {
		return seat_no46;
	}

	public void setSeat_no46(boolean seat_no46) {
		this.seat_no46 = seat_no46;
	}

	public boolean isSeat_no47() {
		return seat_no47;
	}

	public void setSeat_no47(boolean seat_no47) {
		this.seat_no47 = seat_no47;
	}

	public boolean isSeat_no48() {
		return seat_no48;
	}

	public void setSeat_no48(boolean seat_no48) {
		this.seat_no48 = seat_no48;
	}

	public boolean isSeat_no49() {
		return seat_no49;
	}

	public void setSeat_no49(boolean seat_no49) {
		this.seat_no49 = seat_no49;
	}

	public boolean isSeat_no50() {
		return seat_no50;
	}

	public void setSeat_no50(boolean seat_no50) {
		this.seat_no50 = seat_no50;
	}

	public boolean isSeat_no51() {
		return seat_no51;
	}

	public void setSeat_no51(boolean seat_no51) {
		this.seat_no51 = seat_no51;
	}

	public boolean isSeat_no52() {
		return seat_no52;
	}

	public void setSeat_no52(boolean seat_no52) {
		this.seat_no52 = seat_no52;
	}

	public boolean isSeat_no53() {
		return seat_no53;
	}

	public void setSeat_no53(boolean seat_no53) {
		this.seat_no53 = seat_no53;
	}

	public boolean isSeat_no54() {
		return seat_no54;
	}

	public void setSeat_no54(boolean seat_no54) {
		this.seat_no54 = seat_no54;
	}

	public boolean isSeat_no55() {
		return seat_no55;
	}

	public void setSeat_no55(boolean seat_no55) {
		this.seat_no55 = seat_no55;
	}

	public boolean isSeat_no56() {
		return seat_no56;
	}

	public void setSeat_no56(boolean seat_no56) {
		this.seat_no56 = seat_no56;
	}

	public boolean isSeat_no57() {
		return seat_no57;
	}

	public void setSeat_no57(boolean seat_no57) {
		this.seat_no57 = seat_no57;
	}

	public boolean isSeat_no58() {
		return seat_no58;
	}

	public void setSeat_no58(boolean seat_no58) {
		this.seat_no58 = seat_no58;
	}

	public boolean isSeat_no59() {
		return seat_no59;
	}

	public void setSeat_no59(boolean seat_no59) {
		this.seat_no59 = seat_no59;
	}

	public boolean isSeat_no60() {
		return seat_no60;
	}

	public void setSeat_no60(boolean seat_no60) {
		this.seat_no60 = seat_no60;
	}

	public boolean isSeat_no61() {
		return seat_no61;
	}

	public void setSeat_no61(boolean seat_no61) {
		this.seat_no61 = seat_no61;
	}

	public boolean isSeat_no62() {
		return seat_no62;
	}

	public void setSeat_no62(boolean seat_no62) {
		this.seat_no62 = seat_no62;
	}

	public boolean isSeat_no63() {
		return seat_no63;
	}

	public void setSeat_no63(boolean seat_no63) {
		this.seat_no63 = seat_no63;
	}

	public boolean isSeat_no64() {
		return seat_no64;
	}

	public void setSeat_no64(boolean seat_no64) {
		this.seat_no64 = seat_no64;
	}

	public boolean isSeat_no65() {
		return seat_no65;
	}

	public void setSeat_no65(boolean seat_no65) {
		this.seat_no65 = seat_no65;
	}

	public boolean isSeat_no66() {
		return seat_no66;
	}

	public void setSeat_no66(boolean seat_no66) {
		this.seat_no66 = seat_no66;
	}

	public boolean isSeat_no67() {
		return seat_no67;
	}

	public void setSeat_no67(boolean seat_no67) {
		this.seat_no67 = seat_no67;
	}

	public boolean isSeat_no68() {
		return seat_no68;
	}

	public void setSeat_no68(boolean seat_no68) {
		this.seat_no68 = seat_no68;
	}

	public boolean isSeat_no69() {
		return seat_no69;
	}

	public void setSeat_no69(boolean seat_no69) {
		this.seat_no69 = seat_no69;
	}

	public boolean isSeat_no70() {
		return seat_no70;
	}

	public void setSeat_no70(boolean seat_no70) {
		this.seat_no70 = seat_no70;
	}

	public boolean isSeat_no71() {
		return seat_no71;
	}

	public void setSeat_no71(boolean seat_no71) {
		this.seat_no71 = seat_no71;
	}

	public boolean isSeat_no72() {
		return seat_no72;
	}

	public void setSeat_no72(boolean seat_no72) {
		this.seat_no72 = seat_no72;
	}

	public boolean isSeat_no73() {
		return seat_no73;
	}

	public void setSeat_no73(boolean seat_no73) {
		this.seat_no73 = seat_no73;
	}

	public boolean isSeat_no74() {
		return seat_no74;
	}

	public void setSeat_no74(boolean seat_no74) {
		this.seat_no74 = seat_no74;
	}

	public boolean isSeat_no75() {
		return seat_no75;
	}

	public void setSeat_no75(boolean seat_no75) {
		this.seat_no75 = seat_no75;
	}

	public boolean isSeat_no76() {
		return seat_no76;
	}

	public void setSeat_no76(boolean seat_no76) {
		this.seat_no76 = seat_no76;
	}

	public boolean isSeat_no77() {
		return seat_no77;
	}

	public void setSeat_no77(boolean seat_no77) {
		this.seat_no77 = seat_no77;
	}

	public boolean isSeat_no78() {
		return seat_no78;
	}

	public void setSeat_no78(boolean seat_no78) {
		this.seat_no78 = seat_no78;
	}

	public boolean isSeat_no79() {
		return seat_no79;
	}

	public void setSeat_no79(boolean seat_no79) {
		this.seat_no79 = seat_no79;
	}

	public boolean isSeat_no80() {
		return seat_no80;
	}

	public void setSeat_no80(boolean seat_no80) {
		this.seat_no80 = seat_no80;
	}

	public boolean isSeat_no81() {
		return seat_no81;
	}

	public void setSeat_no81(boolean seat_no81) {
		this.seat_no81 = seat_no81;
	}

	public boolean isSeat_no82() {
		return seat_no82;
	}

	public void setSeat_no82(boolean seat_no82) {
		this.seat_no82 = seat_no82;
	}

	public boolean isSeat_no83() {
		return seat_no83;
	}

	public void setSeat_no83(boolean seat_no83) {
		this.seat_no83 = seat_no83;
	}

	public boolean isSeat_no84() {
		return seat_no84;
	}

	public void setSeat_no84(boolean seat_no84) {
		this.seat_no84 = seat_no84;
	}

	public boolean isSeat_no85() {
		return seat_no85;
	}

	public void setSeat_no85(boolean seat_no85) {
		this.seat_no85 = seat_no85;
	}

	public boolean isSeat_no86() {
		return seat_no86;
	}

	public void setSeat_no86(boolean seat_no86) {
		this.seat_no86 = seat_no86;
	}

	public boolean isSeat_no87() {
		return seat_no87;
	}

	public void setSeat_no87(boolean seat_no87) {
		this.seat_no87 = seat_no87;
	}

	public boolean isSeat_no88() {
		return seat_no88;
	}

	public void setSeat_no88(boolean seat_no88) {
		this.seat_no88 = seat_no88;
	}

	public boolean isSeat_no89() {
		return seat_no89;
	}

	public void setSeat_no89(boolean seat_no89) {
		this.seat_no89 = seat_no89;
	}

	public boolean isSeat_no90() {
		return seat_no90;
	}

	public void setSeat_no90(boolean seat_no90) {
		this.seat_no90 = seat_no90;
	}

	public boolean isSeat_no91() {
		return seat_no91;
	}

	public void setSeat_no91(boolean seat_no91) {
		this.seat_no91 = seat_no91;
	}

	public boolean isSeat_no92() {
		return seat_no92;
	}

	public void setSeat_no92(boolean seat_no92) {
		this.seat_no92 = seat_no92;
	}

	public boolean isSeat_no93() {
		return seat_no93;
	}

	public void setSeat_no93(boolean seat_no93) {
		this.seat_no93 = seat_no93;
	}

	public boolean isSeat_no94() {
		return seat_no94;
	}

	public void setSeat_no94(boolean seat_no94) {
		this.seat_no94 = seat_no94;
	}

	public Booking(int movie_id, Date show_date, String show_time, boolean seat_no1, boolean seat_no2, boolean seat_no3,
			boolean seat_no4, boolean seat_no5, boolean seat_no6, boolean seat_no7, boolean seat_no8, boolean seat_no9,
			boolean seat_no10, boolean seat_no11, boolean seat_no12, boolean seat_no13, boolean seat_no14,
			boolean seat_no15, boolean seat_no16, boolean seat_no17, boolean seat_no18, boolean seat_no19,
			boolean seat_no20, boolean seat_no21, boolean seat_no22, boolean seat_no23, boolean seat_no24,
			boolean seat_no25, boolean seat_no26, boolean seat_no27, boolean seat_no28, boolean seat_no29,
			boolean seat_no30, boolean seat_no31, boolean seat_no32, boolean seat_no33, boolean seat_no34,
			boolean seat_no35, boolean seat_no36, boolean seat_no37, boolean seat_no38, boolean seat_no39,
			boolean seat_no40, boolean seat_no41, boolean seat_no42, boolean seat_no43, boolean seat_no44,
			boolean seat_no45, boolean seat_no46, boolean seat_no47, boolean seat_no48, boolean seat_no49,
			boolean seat_no50, boolean seat_no51, boolean seat_no52, boolean seat_no53, boolean seat_no54,
			boolean seat_no55, boolean seat_no56, boolean seat_no57, boolean seat_no58, boolean seat_no59,
			boolean seat_no60, boolean seat_no61, boolean seat_no62, boolean seat_no63, boolean seat_no64,
			boolean seat_no65, boolean seat_no66, boolean seat_no67, boolean seat_no68, boolean seat_no69,
			boolean seat_no70, boolean seat_no71, boolean seat_no72, boolean seat_no73, boolean seat_no74,
			boolean seat_no75, boolean seat_no76, boolean seat_no77, boolean seat_no78, boolean seat_no79,
			boolean seat_no80, boolean seat_no81, boolean seat_no82, boolean seat_no83, boolean seat_no84,
			boolean seat_no85, boolean seat_no86, boolean seat_no87, boolean seat_no88, boolean seat_no89,
			boolean seat_no90, boolean seat_no91, boolean seat_no92, boolean seat_no93, boolean seat_no94) {
		super();
		this.movie_id = movie_id;
		this.show_date = show_date;
		this.show_time = show_time;
		this.seat_no1 = seat_no1;
		this.seat_no2 = seat_no2;
		this.seat_no3 = seat_no3;
		this.seat_no4 = seat_no4;
		this.seat_no5 = seat_no5;
		this.seat_no6 = seat_no6;
		this.seat_no7 = seat_no7;
		this.seat_no8 = seat_no8;
		this.seat_no9 = seat_no9;
		this.seat_no10 = seat_no10;
		this.seat_no11 = seat_no11;
		this.seat_no12 = seat_no12;
		this.seat_no13 = seat_no13;
		this.seat_no14 = seat_no14;
		this.seat_no15 = seat_no15;
		this.seat_no16 = seat_no16;
		this.seat_no17 = seat_no17;
		this.seat_no18 = seat_no18;
		this.seat_no19 = seat_no19;
		this.seat_no20 = seat_no20;
		this.seat_no21 = seat_no21;
		this.seat_no22 = seat_no22;
		this.seat_no23 = seat_no23;
		this.seat_no24 = seat_no24;
		this.seat_no25 = seat_no25;
		this.seat_no26 = seat_no26;
		this.seat_no27 = seat_no27;
		this.seat_no28 = seat_no28;
		this.seat_no29 = seat_no29;
		this.seat_no30 = seat_no30;
		this.seat_no31 = seat_no31;
		this.seat_no32 = seat_no32;
		this.seat_no33 = seat_no33;
		this.seat_no34 = seat_no34;
		this.seat_no35 = seat_no35;
		this.seat_no36 = seat_no36;
		this.seat_no37 = seat_no37;
		this.seat_no38 = seat_no38;
		this.seat_no39 = seat_no39;
		this.seat_no40 = seat_no40;
		this.seat_no41 = seat_no41;
		this.seat_no42 = seat_no42;
		this.seat_no43 = seat_no43;
		this.seat_no44 = seat_no44;
		this.seat_no45 = seat_no45;
		this.seat_no46 = seat_no46;
		this.seat_no47 = seat_no47;
		this.seat_no48 = seat_no48;
		this.seat_no49 = seat_no49;
		this.seat_no50 = seat_no50;
		this.seat_no51 = seat_no51;
		this.seat_no52 = seat_no52;
		this.seat_no53 = seat_no53;
		this.seat_no54 = seat_no54;
		this.seat_no55 = seat_no55;
		this.seat_no56 = seat_no56;
		this.seat_no57 = seat_no57;
		this.seat_no58 = seat_no58;
		this.seat_no59 = seat_no59;
		this.seat_no60 = seat_no60;
		this.seat_no61 = seat_no61;
		this.seat_no62 = seat_no62;
		this.seat_no63 = seat_no63;
		this.seat_no64 = seat_no64;
		this.seat_no65 = seat_no65;
		this.seat_no66 = seat_no66;
		this.seat_no67 = seat_no67;
		this.seat_no68 = seat_no68;
		this.seat_no69 = seat_no69;
		this.seat_no70 = seat_no70;
		this.seat_no71 = seat_no71;
		this.seat_no72 = seat_no72;
		this.seat_no73 = seat_no73;
		this.seat_no74 = seat_no74;
		this.seat_no75 = seat_no75;
		this.seat_no76 = seat_no76;
		this.seat_no77 = seat_no77;
		this.seat_no78 = seat_no78;
		this.seat_no79 = seat_no79;
		this.seat_no80 = seat_no80;
		this.seat_no81 = seat_no81;
		this.seat_no82 = seat_no82;
		this.seat_no83 = seat_no83;
		this.seat_no84 = seat_no84;
		this.seat_no85 = seat_no85;
		this.seat_no86 = seat_no86;
		this.seat_no87 = seat_no87;
		this.seat_no88 = seat_no88;
		this.seat_no89 = seat_no89;
		this.seat_no90 = seat_no90;
		this.seat_no91 = seat_no91;
		this.seat_no92 = seat_no92;
		this.seat_no93 = seat_no93;
		this.seat_no94 = seat_no94;
	}

	public Booking() {
		super();
	}
	
	

}
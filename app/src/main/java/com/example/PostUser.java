package com.example;

import android.location.Location;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class PostUser {
    public boolean is_current_company;
    public boolean active;
    public boolean is_pro;
    public int meeting_charges;
    public int call_duration;
    public boolean is_online;
    public boolean is_verified;
    public String role;
    public int points;
    public int post_count;
    public int message_count;
    public int contact_count;
    public int reply_count;
    public int reply_counts;
    public int like_count;
    public int forward_count;
    public int share_count;
    public int invite_count;
    public int call_count;
    public int profile_view_count;
    public List<String> skills;
    public boolean is_public;
    public boolean is_following;
    public int meeting_count;
    public int attended_meeting_count;
    public int invitation_count;
    public int booking_count;
    public int attended_booking_count;
    public int service_charges;
    public int total_charges;
    public String _id;
    public Date last_login;
    public String phone_number;
    public Date createdAt;
    public Date updatedAt;
    public int __v;
    public AvailabilityDays availability_days;
    public int availability_end;
    public int availability_start;
    public String bio;
    public Date bod;
    public Object call_time_zone;
    public String call_title;
    public String city;
    public String company_name;
    public String company_thumb;
    public String country;
    public Education education;
    public String fcm_token;
    public String first_name;
    public String iban;
    public String last_name;
    public String link;
    public String occupation;
    public String thumb;
    public String timezone;
    public String timezone_name;
    public String video_intro;
    public String video_intro_thumb;
    public Date work_end;
    public Date work_start;
    public Date pro_validity;
    @SerializedName("location")
    public PostLocation location;
    public String email;

    public PostUser(boolean is_current_company, boolean active, boolean is_pro, int meeting_charges, int call_duration, boolean is_online, boolean is_verified, String role, int points, int post_count, int message_count, int contact_count, int reply_count, int reply_counts, int like_count, int forward_count, int share_count, int invite_count, int call_count, int profile_view_count, List<String> skills, boolean is_public, boolean is_following, int meeting_count, int attended_meeting_count, int invitation_count, int booking_count, int attended_booking_count, int service_charges, int total_charges, String _id, Date last_login, String phone_number, Date createdAt, Date updatedAt, int __v, AvailabilityDays availability_days, int availability_end, int availability_start, String bio, Date bod, Object call_time_zone, String call_title, String city, String company_name, String company_thumb, String country, Education education, String fcm_token, String first_name, String iban, String last_name, String link, String occupation, String thumb, String timezone, String timezone_name, String video_intro, String video_intro_thumb, Date work_end, Date work_start, Date pro_validity, PostLocation location, String email) {
        this.is_current_company = is_current_company;
        this.active = active;
        this.is_pro = is_pro;
        this.meeting_charges = meeting_charges;
        this.call_duration = call_duration;
        this.is_online = is_online;
        this.is_verified = is_verified;
        this.role = role;
        this.points = points;
        this.post_count = post_count;
        this.message_count = message_count;
        this.contact_count = contact_count;
        this.reply_count = reply_count;
        this.reply_counts = reply_counts;
        this.like_count = like_count;
        this.forward_count = forward_count;
        this.share_count = share_count;
        this.invite_count = invite_count;
        this.call_count = call_count;
        this.profile_view_count = profile_view_count;
        this.skills = skills;
        this.is_public = is_public;
        this.is_following = is_following;
        this.meeting_count = meeting_count;
        this.attended_meeting_count = attended_meeting_count;
        this.invitation_count = invitation_count;
        this.booking_count = booking_count;
        this.attended_booking_count = attended_booking_count;
        this.service_charges = service_charges;
        this.total_charges = total_charges;
        this._id = _id;
        this.last_login = last_login;
        this.phone_number = phone_number;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.__v = __v;
        this.availability_days = availability_days;
        this.availability_end = availability_end;
        this.availability_start = availability_start;
        this.bio = bio;
        this.bod = bod;
        this.call_time_zone = call_time_zone;
        this.call_title = call_title;
        this.city = city;
        this.company_name = company_name;
        this.company_thumb = company_thumb;
        this.country = country;
        this.education = education;
        this.fcm_token = fcm_token;
        this.first_name = first_name;
        this.iban = iban;
        this.last_name = last_name;
        this.link = link;
        this.occupation = occupation;
        this.thumb = thumb;
        this.timezone = timezone;
        this.timezone_name = timezone_name;
        this.video_intro = video_intro;
        this.video_intro_thumb = video_intro_thumb;
        this.work_end = work_end;
        this.work_start = work_start;
        this.pro_validity = pro_validity;
        this.location = location;
        this.email = email;
    }

    public boolean isIs_current_company() {
        return is_current_company;
    }

    public void setIs_current_company(boolean is_current_company) {
        this.is_current_company = is_current_company;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isIs_pro() {
        return is_pro;
    }

    public void setIs_pro(boolean is_pro) {
        this.is_pro = is_pro;
    }

    public int getMeeting_charges() {
        return meeting_charges;
    }

    public void setMeeting_charges(int meeting_charges) {
        this.meeting_charges = meeting_charges;
    }

    public int getCall_duration() {
        return call_duration;
    }

    public void setCall_duration(int call_duration) {
        this.call_duration = call_duration;
    }

    public boolean isIs_online() {
        return is_online;
    }

    public void setIs_online(boolean is_online) {
        this.is_online = is_online;
    }

    public boolean isIs_verified() {
        return is_verified;
    }

    public void setIs_verified(boolean is_verified) {
        this.is_verified = is_verified;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPost_count() {
        return post_count;
    }

    public void setPost_count(int post_count) {
        this.post_count = post_count;
    }

    public int getMessage_count() {
        return message_count;
    }

    public void setMessage_count(int message_count) {
        this.message_count = message_count;
    }

    public int getContact_count() {
        return contact_count;
    }

    public void setContact_count(int contact_count) {
        this.contact_count = contact_count;
    }

    public int getReply_count() {
        return reply_count;
    }

    public void setReply_count(int reply_count) {
        this.reply_count = reply_count;
    }

    public int getReply_counts() {
        return reply_counts;
    }

    public void setReply_counts(int reply_counts) {
        this.reply_counts = reply_counts;
    }

    public int getLike_count() {
        return like_count;
    }

    public void setLike_count(int like_count) {
        this.like_count = like_count;
    }

    public int getForward_count() {
        return forward_count;
    }

    public void setForward_count(int forward_count) {
        this.forward_count = forward_count;
    }

    public int getShare_count() {
        return share_count;
    }

    public void setShare_count(int share_count) {
        this.share_count = share_count;
    }

    public int getInvite_count() {
        return invite_count;
    }

    public void setInvite_count(int invite_count) {
        this.invite_count = invite_count;
    }

    public int getCall_count() {
        return call_count;
    }

    public void setCall_count(int call_count) {
        this.call_count = call_count;
    }

    public int getProfile_view_count() {
        return profile_view_count;
    }

    public void setProfile_view_count(int profile_view_count) {
        this.profile_view_count = profile_view_count;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public boolean isIs_public() {
        return is_public;
    }

    public void setIs_public(boolean is_public) {
        this.is_public = is_public;
    }

    public boolean isIs_following() {
        return is_following;
    }

    public void setIs_following(boolean is_following) {
        this.is_following = is_following;
    }

    public int getMeeting_count() {
        return meeting_count;
    }

    public void setMeeting_count(int meeting_count) {
        this.meeting_count = meeting_count;
    }

    public int getAttended_meeting_count() {
        return attended_meeting_count;
    }

    public void setAttended_meeting_count(int attended_meeting_count) {
        this.attended_meeting_count = attended_meeting_count;
    }

    public int getInvitation_count() {
        return invitation_count;
    }

    public void setInvitation_count(int invitation_count) {
        this.invitation_count = invitation_count;
    }

    public int getBooking_count() {
        return booking_count;
    }

    public void setBooking_count(int booking_count) {
        this.booking_count = booking_count;
    }

    public int getAttended_booking_count() {
        return attended_booking_count;
    }

    public void setAttended_booking_count(int attended_booking_count) {
        this.attended_booking_count = attended_booking_count;
    }

    public int getService_charges() {
        return service_charges;
    }

    public void setService_charges(int service_charges) {
        this.service_charges = service_charges;
    }

    public int getTotal_charges() {
        return total_charges;
    }

    public void setTotal_charges(int total_charges) {
        this.total_charges = total_charges;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public AvailabilityDays getAvailability_days() {
        return availability_days;
    }

    public void setAvailability_days(AvailabilityDays availability_days) {
        this.availability_days = availability_days;
    }

    public int getAvailability_end() {
        return availability_end;
    }

    public void setAvailability_end(int availability_end) {
        this.availability_end = availability_end;
    }

    public int getAvailability_start() {
        return availability_start;
    }

    public void setAvailability_start(int availability_start) {
        this.availability_start = availability_start;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getBod() {
        return bod;
    }

    public void setBod(Date bod) {
        this.bod = bod;
    }

    public Object getCall_time_zone() {
        return call_time_zone;
    }

    public void setCall_time_zone(Object call_time_zone) {
        this.call_time_zone = call_time_zone;
    }

    public String getCall_title() {
        return call_title;
    }

    public void setCall_title(String call_title) {
        this.call_title = call_title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_thumb() {
        return company_thumb;
    }

    public void setCompany_thumb(String company_thumb) {
        this.company_thumb = company_thumb;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public String getFcm_token() {
        return fcm_token;
    }

    public void setFcm_token(String fcm_token) {
        this.fcm_token = fcm_token;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimezone_name() {
        return timezone_name;
    }

    public void setTimezone_name(String timezone_name) {
        this.timezone_name = timezone_name;
    }

    public String getVideo_intro() {
        return video_intro;
    }

    public void setVideo_intro(String video_intro) {
        this.video_intro = video_intro;
    }

    public String getVideo_intro_thumb() {
        return video_intro_thumb;
    }

    public void setVideo_intro_thumb(String video_intro_thumb) {
        this.video_intro_thumb = video_intro_thumb;
    }

    public Date getWork_end() {
        return work_end;
    }

    public void setWork_end(Date work_end) {
        this.work_end = work_end;
    }

    public Date getWork_start() {
        return work_start;
    }

    public void setWork_start(Date work_start) {
        this.work_start = work_start;
    }

    public Date getPro_validity() {
        return pro_validity;
    }

    public void setPro_validity(Date pro_validity) {
        this.pro_validity = pro_validity;
    }

    public PostLocation getLocation() {
        return location;
    }

    public void setLocation(PostLocation location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

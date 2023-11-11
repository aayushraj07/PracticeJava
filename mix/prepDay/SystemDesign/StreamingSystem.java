package prepDay.SystemDesign;


public class StreamingSystem {


        private DataBase database;

        public int seekTime(String userId , String videoId){
            WatchedVideo watchedVideo = database.getWatchedVideo(userId, videoId);
                return watchedVideo.getSeekTime();
            }
        }

    class DataBase{
        public WatchedVideo getWatchedVideo(String userID, String videoId){
            return null;
        }
    }

    class VideoService{
        private FileSystem fileSystem;

        public Frame getFrame(String videoId , int timestamp) {
            Video video = fileSystem.getVideo(videoId);
            return video.getFrame(timestamp);
        }
    }
    class FileSystem{
        public Video getVideo(String videoId){
            return null;
        }
    }

    class Video{
        String id;
        Frame[] frames;
        String jsonMetaData;

        public Frame getFrame(int timeStamp){
            for(int i =0; i< frames.length; i++){
                if(frames[i].starttimestamp <= timeStamp &&
                frames[i].endtimestamp > timeStamp){
                    return frames[timeStamp];
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    class Frame{
        byte[] bytes;
        int starttimestamp;
        int endtimestamp;

        public static int frameTime = 10;
    }

    class User{
        String id;
        String name;
        String email;

        public String getId(){
            return id;
        }
    }

    class WatchedVideo{
        String id;
        String videoId;
        String userId;
        int seekTime;

        public int getSeekTime(){
            return seekTime;
        }
    }






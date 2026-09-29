package p000;

import android.net.Uri;
import android.os.StrictMode;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jdd {
    /* JADX INFO: renamed from: a */
    public static int m14411a(Map map) {
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            String strM11402l = ez5.m11402l(str);
            strM11402l.getClass();
            switch (strM11402l) {
                case "audio/eac3-joc":
                case "audio/ac3":
                case "audio/eac3":
                    return 0;
                case "video/mp2p":
                    return 10;
                case "video/mp2t":
                    return 11;
                case "video/webm":
                case "audio/x-matroska":
                case "application/webm":
                case "audio/webm":
                case "video/x-matroska":
                    return 6;
                case "audio/amr-wb":
                case "audio/amr":
                case "audio/3gpp":
                    return 3;
                case "image/avif":
                    return 21;
                case "image/heic":
                case "image/heif":
                    return 20;
                case "image/jpeg":
                    return 14;
                case "image/webp":
                    return 18;
                case "application/mp4":
                case "audio/mp4":
                case "video/mp4":
                    return 8;
                case "video/x-msvideo":
                    return 16;
                case "text/vtt":
                    return 13;
                case "image/bmp":
                    return 19;
                case "image/png":
                    return 17;
                case "video/x-flv":
                    return 5;
                case "audio/ac4":
                    return 1;
                case "audio/ogg":
                    return 9;
                case "audio/wav":
                    return 12;
                case "audio/flac":
                    return 4;
                case "audio/midi":
                    return 15;
                case "audio/mpeg":
                    return 7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m14412b(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* JADX INFO: renamed from: c */
    public static Object m14413c(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}

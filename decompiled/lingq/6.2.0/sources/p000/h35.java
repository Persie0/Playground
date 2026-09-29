package p000;

import android.os.Parcelable;
import com.lingq.core.p012ui.LessonInfoSource;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class h35 {
    /* JADX INFO: renamed from: a */
    public static i35 m13023a(nl8 nl8Var) {
        nl8Var.getClass();
        if (!nl8Var.m17487a("lessonId")) {
            C3386nv.m17626m("Required argument \"lessonId\" is missing and does not have an android:defaultValue");
            return null;
        }
        Integer num = (Integer) nl8Var.m17488b("lessonId");
        if (num == null) {
            C3386nv.m17626m("Argument \"lessonId\" of type integer does not support null values");
            return null;
        }
        if (!nl8Var.m17487a("title")) {
            C3386nv.m17626m("Required argument \"title\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str = (String) nl8Var.m17488b("title");
        if (str == null) {
            C3386nv.m17626m("Argument \"title\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!nl8Var.m17487a("imageURL")) {
            C3386nv.m17626m("Required argument \"imageURL\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str2 = (String) nl8Var.m17488b("imageURL");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"imageURL\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!nl8Var.m17487a("originalImageUrl")) {
            C3386nv.m17626m("Required argument \"originalImageUrl\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str3 = (String) nl8Var.m17488b("originalImageUrl");
        if (!nl8Var.m17487a("description")) {
            C3386nv.m17626m("Required argument \"description\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str4 = (String) nl8Var.m17488b("description");
        if (str4 == null) {
            C3386nv.m17626m("Argument \"description\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!nl8Var.m17487a("from")) {
            C3386nv.m17626m("Required argument \"from\" is missing and does not have an android:defaultValue");
            return null;
        }
        if (!Parcelable.class.isAssignableFrom(LessonInfoSource.class) && !Serializable.class.isAssignableFrom(LessonInfoSource.class)) {
            C3386nv.m17636w(LessonInfoSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            return null;
        }
        LessonInfoSource lessonInfoSource = (LessonInfoSource) nl8Var.m17488b("from");
        if (lessonInfoSource == null) {
            C3386nv.m17626m("Argument \"from\" is marked as non-null but was passed a null value");
            return null;
        }
        if (!nl8Var.m17487a("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            return null;
        }
        String str5 = (String) nl8Var.m17488b("shelfCode");
        if (str5 != null) {
            return new i35(num.intValue(), str, str2, str3, str4, lessonInfoSource, str5);
        }
        C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value");
        return null;
    }
}

package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.DisplayCutout;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aek {
    /* JADX INFO: renamed from: a */
    static int m342a(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* JADX INFO: renamed from: b */
    static int m343b(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* JADX INFO: renamed from: c */
    static int m344c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* JADX INFO: renamed from: d */
    static int m345d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    /* JADX INFO: renamed from: e */
    static DisplayCutout m346e(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: f */
    static List m347f(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* JADX INFO: renamed from: g */
    public static final aps m348g(Context context, Class cls, String str) {
        if (ook.m18800n(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new aps(context, cls, str);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m349h(Class cls) {
        String str;
        Package r0 = cls.getPackage();
        r0.getClass();
        String name = r0.getName();
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        name.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        canonicalName.getClass();
        String strReplace = canonicalName.replace('.', '_');
        strReplace.getClass();
        String strConcat = strReplace.concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + EArqVBjecl.sdHc + strConcat + " does not exist");
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())));
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())));
        }
    }
}

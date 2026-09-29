package p000;

import com.facebook.LoggingBehavior;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qj5 {

    /* JADX INFO: renamed from: d */
    public static final iy5 f57852d = new iy5(13);

    /* JADX INFO: renamed from: e */
    public static final HashMap f57853e = new HashMap();

    /* JADX INFO: renamed from: a */
    public final LoggingBehavior f57854a;

    /* JADX INFO: renamed from: b */
    public final String f57855b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f57856c;

    public qj5(LoggingBehavior loggingBehavior) {
        loggingBehavior.getClass();
        this.f57854a = loggingBehavior;
        eda.m11073f("Request", "tag");
        this.f57855b = "FacebookSDK.".concat("Request");
        this.f57856c = new StringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public final void m20002a() {
        sy2.m21773h(this.f57854a);
    }
}

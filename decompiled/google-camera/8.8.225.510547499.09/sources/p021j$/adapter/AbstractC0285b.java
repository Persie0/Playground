package p021j$.adapter;

import android.os.StrictMode;
import java.net.URI;
import java.nio.file.FileSystems;
import p021j$.desugar.sun.nio.p023fs.AbstractC0290d;
import p021j$.nio.file.spi.AbstractC0406c;
import p021j$.nio.file.spi.C0404a;

/* JADX INFO: renamed from: j$.adapter.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0285b {

    /* JADX INFO: renamed from: a */
    private static final AbstractC0406c f32761a;

    static {
        AbstractC0406c abstractC0406cM11975a;
        if (AbstractC0284a.f32759b) {
            abstractC0406cM11975a = C0404a.m12214B(FileSystems.getDefault().provider());
        } else {
            if (AbstractC0284a.f32760c) {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().build());
            }
            abstractC0406cM11975a = AbstractC0290d.m11975a();
        }
        f32761a = abstractC0406cM11975a;
        abstractC0406cM11975a.mo12012j(URI.create("file:///"));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0406c m11968a() {
        return f32761a;
    }
}

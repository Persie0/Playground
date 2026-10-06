package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class but implements bvm, buv {

    /* JADX INFO: renamed from: a */
    private final Context f4499a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4500b;

    public but(Context context, int i) {
        this.f4500b = i;
        this.f4499a = context;
    }

    @Override // p000.buv
    /* JADX INFO: renamed from: a */
    public final Class mo3085a() {
        switch (this.f4500b) {
            case 0:
                return Drawable.class;
            case 1:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4500b) {
            case 0:
                break;
            case 1:
                break;
        }
        return new buw(this.f4499a, this, 0);
    }

    @Override // p000.buv
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3086c(Resources.Theme theme, Resources resources, int i) {
        switch (this.f4500b) {
            case 0:
                Context context = this.f4499a;
                return bya.m3180a(context, context, i, theme);
            case 1:
                return resources.openRawResourceFd(i);
            default:
                return resources.openRawResource(i);
        }
    }

    @Override // p000.buv
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo3087d(Object obj) throws IOException {
        switch (this.f4500b) {
            case 0:
                break;
            case 1:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }
}

package p000;

import android.content.pm.ResolveInfo;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzv {

    /* JADX INFO: renamed from: a */
    private boolean f30094a;

    /* JADX INFO: renamed from: b */
    private boolean f30095b;

    /* JADX INFO: renamed from: c */
    private boolean f30096c;

    /* JADX INFO: renamed from: d */
    private byte f30097d;

    /* JADX INFO: renamed from: e */
    private Object f30098e;

    /* JADX INFO: renamed from: a */
    public final hzw m10963a() {
        Object obj;
        if (this.f30097d == 7 && (obj = this.f30098e) != null) {
            return new hzw(this.f30094a, this.f30095b, this.f30096c, (mws) obj);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f30097d & 1) == 0) {
            sb.append(" supportDocumentScanning");
        }
        if ((this.f30097d & 2) == 0) {
            sb.append(" supportTextFilterIntent");
        }
        if ((this.f30097d & 4) == 0) {
            sb.append(hsSUWRJfoeC.WRAxKAZvxpbnpQT);
        }
        if (this.f30098e == null) {
            sb.append(" supportedTranslateLanguages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10964b(boolean z) {
        this.f30094a = z;
        this.f30097d = (byte) (this.f30097d | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m10965c(boolean z) {
        this.f30095b = z;
        this.f30097d = (byte) (this.f30097d | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m10966d(boolean z) {
        this.f30096c = z;
        this.f30097d = (byte) (this.f30097d | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m10967e(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null supportedTranslateLanguages");
        }
        this.f30098e = mwsVar;
    }

    /* JADX INFO: renamed from: f */
    public final hhs m10968f() {
        Object obj;
        if (this.f30097d == 7 && (obj = this.f30098e) != null) {
            return new hhs((ResolveInfo) obj, this.f30095b, this.f30094a, this.f30096c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f30098e == null) {
            sb.append(" resolveInfo");
        }
        if ((this.f30097d & 1) == 0) {
            sb.append(" selected");
        }
        if ((this.f30097d & 2) == 0) {
            sb.append(" preselected");
        }
        if ((this.f30097d & 4) == 0) {
            sb.append(" supported");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: g */
    public final void m10969g(boolean z) {
        this.f30094a = z;
        this.f30097d = (byte) (this.f30097d | 2);
    }

    /* JADX INFO: renamed from: h */
    public final void m10970h(ResolveInfo resolveInfo) {
        if (resolveInfo == null) {
            throw new NullPointerException("Null resolveInfo");
        }
        this.f30098e = resolveInfo;
    }

    /* JADX INFO: renamed from: i */
    public final void m10971i(boolean z) {
        this.f30095b = z;
        this.f30097d = (byte) (this.f30097d | 1);
    }

    /* JADX INFO: renamed from: j */
    public final void m10972j(boolean z) {
        this.f30096c = z;
        this.f30097d = (byte) (this.f30097d | 4);
    }
}

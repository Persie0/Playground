package p000;

import android.util.Size;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzn {

    /* JADX INFO: renamed from: a */
    public Size f30056a;

    /* JADX INFO: renamed from: b */
    public Size f30057b;

    /* JADX INFO: renamed from: c */
    public Integer f30058c;

    /* JADX INFO: renamed from: d */
    private Size f30059d;

    /* JADX INFO: renamed from: e */
    private boolean f30060e;

    /* JADX INFO: renamed from: f */
    private ilk f30061f;

    /* JADX INFO: renamed from: g */
    private ikw f30062g;

    /* JADX INFO: renamed from: h */
    private hzj f30063h;

    /* JADX INFO: renamed from: i */
    private byte f30064i;

    public hzn() {
    }

    public hzn(hzo hzoVar) {
        this.f30056a = hzoVar.f30066b;
        this.f30057b = hzoVar.f30067c;
        this.f30059d = hzoVar.f30068d;
        this.f30058c = hzoVar.f30069e;
        this.f30060e = hzoVar.f30070f;
        this.f30061f = hzoVar.f30071g;
        this.f30062g = hzoVar.f30072h;
        this.f30063h = hzoVar.f30073i;
        this.f30064i = (byte) 3;
    }

    /* JADX INFO: renamed from: a */
    public final hzo m10941a() {
        Size size = this.f30057b;
        Integer num = this.f30058c;
        if (size != null && num != null) {
            ilk ilkVar = this.f30061f;
            if (ilkVar == null) {
                throw new IllegalStateException("Property \"orientation\" has not been set");
            }
            kay kayVarM13889b = kay.m13889b(ilkVar.f31449e + num.intValue());
            boolean z = kayVarM13889b.equals(kay.CLOCKWISE_90) || kayVarM13889b.equals(kay.CLOCKWISE_270);
            this.f30059d = new Size(z ? size.getHeight() : size.getWidth(), z ? size.getWidth() : size.getHeight());
        }
        if (this.f30064i == 3 && this.f30061f != null && this.f30062g != null && this.f30063h != null) {
            return new hzo(this.f30056a, this.f30057b, this.f30059d, this.f30058c, this.f30060e, this.f30061f, this.f30062g, this.f30063h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f30064i & 1) == 0) {
            sb.append(" isPreviewMaximized");
        }
        if ((this.f30064i & 2) == 0) {
            sb.append(" hasCutout");
        }
        if (this.f30061f == null) {
            sb.append(" orientation");
        }
        if (this.f30062g == null) {
            sb.append(" mode");
        }
        if (this.f30063h == null) {
            sb.append(" decision");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10942b(hzj hzjVar) {
        if (hzjVar == null) {
            throw new NullPointerException("Null decision");
        }
        this.f30063h = hzjVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m10943c(boolean z) {
        this.f30060e = z;
        this.f30064i = (byte) (this.f30064i | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m10944d() {
        this.f30064i = (byte) (this.f30064i | 1);
    }

    /* JADX INFO: renamed from: e */
    public final void m10945e(ikw ikwVar) {
        if (ikwVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.f30062g = ikwVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m10946f(ilk ilkVar) {
        if (ilkVar == null) {
            throw new NullPointerException("Null orientation");
        }
        this.f30061f = ilkVar;
    }
}

package p000;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bus implements bra {

    /* JADX INFO: renamed from: a */
    private final String f4497a;

    /* JADX INFO: renamed from: b */
    private Object f4498b;

    public bus(String str) {
        this.f4497a = str;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return InputStream.class;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        try {
            ((InputStream) this.f4498b).close();
        } catch (IOException e) {
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        try {
            String str = this.f4497a;
            if (!str.startsWith("data:image")) {
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
            this.f4498b = byteArrayInputStream;
            bqzVar.mo2945b(byteArrayInputStream);
        } catch (IllegalArgumentException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}

package p000;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bhg extends Paint {
    public bhg() {
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public bhg(int i) {
        super(i);
    }

    public bhg(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    public bhg(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }
}

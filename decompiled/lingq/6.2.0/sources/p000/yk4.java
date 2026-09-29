package p000;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes2.dex */
public final class yk4 extends Paint {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69927a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk4(PorterDuff.Mode mode) {
        super(1);
        this.f69927a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    /* JADX INFO: renamed from: a */
    private final void m25165a(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        switch (this.f69927a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 30) {
                    super.setAlpha(f06.m11422c(i));
                } else {
                    setColor((f06.m11422c(i) << 24) | (getColor() & 16777215));
                }
                break;
            default:
                super.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f69927a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk4(int i, int i2) {
        super(i);
        this.f69927a = i2;
    }
}

package p000;

import android.widget.SeekBar;
import com.google.android.apps.camera.bottombar.C0100R;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ita implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ite f32044a;

    /* JADX INFO: renamed from: b */
    private float f32045b = 1.0f;

    public ita(ite iteVar) {
        this.f32044a = iteVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2;
        mxk mxkVarM11711b;
        if (z) {
            ite iteVar = this.f32044a;
            if (iteVar.f32074Y) {
                return;
            }
            if (iteVar.f32064O.m4550D()) {
                ite iteVar2 = this.f32044a;
                if (iteVar2.f32068S) {
                    iteVar2.f32073X = true;
                    iteVar2.f32064O.m4548B(i);
                    ite iteVar3 = this.f32044a;
                    if (iteVar3.f32071V) {
                        iteVar3.f32086aj.m17608d();
                        return;
                    }
                    return;
                }
            }
            lku.m15670x(((Float) ((jwf) this.f32044a.f32101f).f34942d).floatValue() != 0.0f, "max zoom value hasn't been initialized properly");
            this.f32044a.f32076a.incrementAndGet();
            ite iteVar4 = this.f32044a;
            int i3 = i - iteVar4.f32080ad;
            iteVar4.f32059J.getDimensionPixelSize(C0100R.dimen.zoom_seekbar_width);
            int dimensionPixelSize = iteVar4.f32059J.getDimensionPixelSize(C0100R.dimen.zoom_icon_size);
            int dimensionPixelSize2 = iteVar4.f32059J.getDimensionPixelSize(C0100R.dimen.zoom_seekbar_width);
            float max = iteVar4.f32061L.getMax();
            int max2 = iteVar4.f32061L.getMax();
            int i4 = (int) ((dimensionPixelSize / dimensionPixelSize2) * max);
            if (Math.abs(i3) >= i4 / 2 || iteVar4.f32079ac != 0 || i3 == 0) {
                int i5 = iteVar4.f32079ac;
                if (i5 != 0) {
                    int i6 = i4 / 30;
                    if (i5 > i6) {
                        iteVar4.f32079ac = i5 - i6;
                    } else if (i5 < (-i6)) {
                        iteVar4.f32079ac = i5 + i6;
                    } else {
                        iteVar4.m11733N(i);
                    }
                    int i7 = i - iteVar4.f32079ac;
                    if (i7 < 0) {
                        iteVar4.m11733N(i);
                        i = 0;
                    } else if (i7 > max2 || i == max2) {
                        iteVar4.m11733N(i);
                        i = max2;
                    } else {
                        i = i7;
                    }
                }
            } else {
                iteVar4.f32079ac = i3;
                i = iteVar4.f32080ad;
            }
            float max3 = this.f32044a.f32061L.getMax();
            double dFloatValue = ((Float) ((jwf) this.f32044a.f32102g).f34942d).floatValue();
            double dPow = Math.pow(((Float) ((jwf) this.f32044a.f32101f).f34942d).floatValue() / ((Float) ((jwf) this.f32044a.f32102g).f34942d).floatValue(), i / max3);
            Double.isNaN(dFloatValue);
            float f = (float) (dFloatValue * dPow);
            if (this.f32044a.f32099d.mo6184l(dib.f11317bX) && this.f32044a.f32071V) {
                float fFloatValue = new BigDecimal(f).setScale(1, RoundingMode.HALF_UP).floatValue();
                ite iteVar5 = this.f32044a;
                double d = fFloatValue;
                if (iteVar5.f32083ag != d) {
                    isq isqVar = iteVar5.f32121z;
                    ikw ikwVar = (ikw) iteVar5.f32110o.mo3831be();
                    ite iteVar6 = this.f32044a;
                    kmq kmqVar = iteVar6.f32055F;
                    boolean zM14667g = iteVar6.f32109n.m14667g();
                    boolean zM11741V = this.f32044a.m11741V();
                    boolean z2 = this.f32044a.f32109n.f36775h;
                    ikw ikwVar2 = ikw.UNINITIALIZED;
                    switch (ikwVar.ordinal()) {
                        case 2:
                        case 13:
                            i2 = kmqVar == kmq.BACK ? 5 : 11;
                            mxkVarM11711b = isqVar.m11711b(i2);
                            break;
                        case 5:
                            i2 = 6;
                            mxkVarM11711b = isqVar.m11711b(i2);
                            break;
                        case 6:
                            if (kmqVar != kmq.BACK) {
                                i2 = 10;
                            } else if (zM14667g) {
                                mxkVarM11711b = isqVar.m11711b(4);
                            } else {
                                i2 = 3;
                            }
                            mxkVarM11711b = isqVar.m11711b(i2);
                            break;
                        default:
                            if (kmqVar != kmq.BACK) {
                                i2 = z2 ? 9 : 7;
                                mxkVarM11711b = isqVar.m11711b(i2);
                            } else if (!zM11741V) {
                                mxkVarM11711b = isqVar.m11711b(1);
                            } else {
                                mxkVarM11711b = isqVar.m11711b(2);
                            }
                            break;
                    }
                    if (mxkVarM11711b.contains(Float.valueOf(fFloatValue))) {
                        this.f32044a.f32061L.performHapticFeedback(4);
                    }
                }
                this.f32044a.f32083ag = d;
            }
            this.f32045b = f;
            ite iteVar7 = this.f32044a;
            iteVar7.f32116u.mo3415bf((Float) iteVar7.f32103h.mo3831be());
            if (this.f32044a.f32076a.intValue() > 1) {
                this.f32044a.f32103h.mo3415bf(Float.valueOf(f));
                if (this.f32044a.f32076a.intValue() == 2) {
                    this.f32044a.f32054E.mo11684n();
                    this.f32044a.f32060K.m4529d(true);
                }
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (this.f32044a.f32064O.m4550D()) {
            ite iteVar = this.f32044a;
            if (iteVar.f32068S) {
                iteVar.m11762m();
                ite iteVar2 = this.f32044a;
                if (iteVar2.f32074Y) {
                    iteVar2.f32097b.set(seekBar.getProgress());
                    return;
                }
                return;
            }
        }
        this.f32044a.m11733N(seekBar.getProgress());
        this.f32044a.f32076a.set(0);
        this.f32044a.f32060K.m4529d(false);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (this.f32044a.f32076a.intValue() <= 1 && !this.f32044a.f32064O.m4550D()) {
            this.f32044a.f32054E.mo11677d(this.f32045b, 5);
            this.f32044a.f32116u.mo3415bf(Float.valueOf(this.f32045b));
        }
        ite iteVar = this.f32044a;
        if (iteVar.f32074Y && iteVar.f32064O.m4550D() && seekBar.getProgress() == this.f32044a.f32097b.get()) {
            ite iteVar2 = this.f32044a;
            if (!iteVar2.f32069T && iteVar2.f32112q.get()) {
                this.f32044a.f32064O.m4547A(seekBar.getProgress(), true);
                ite iteVar3 = this.f32044a;
                iteVar3.m11736Q(iteVar3.f32061L.getProgress());
                ite iteVar4 = this.f32044a;
                if (iteVar4.f32071V) {
                    iteVar4.f32086aj.m17608d();
                }
            }
        }
        this.f32044a.f32054E.mo11686p();
        ite iteVar5 = this.f32044a;
        iteVar5.f32080ad = 0;
        iteVar5.f32079ac = 0;
    }
}

package p000;

import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.RawReadView;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cpf implements Consumer {

    /* JADX INFO: renamed from: s */
    private final /* synthetic */ int f8567s;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ cpf f8566r = new cpf(19);

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ cpf f8565q = new cpf(18);

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ cpf f8564p = new cpf(17);

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ cpf f8563o = new cpf(14);

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ cpf f8562n = new cpf(13);

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ cpf f8561m = new cpf(12);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ cpf f8560l = new cpf(11);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ cpf f8559k = new cpf(10);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ cpf f8558j = new cpf(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ cpf f8557i = new cpf(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ cpf f8556h = new cpf(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ cpf f8555g = new cpf(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cpf f8554f = new cpf(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ cpf f8553e = new cpf(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ cpf f8552d = new cpf(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ cpf f8551c = new cpf(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ cpf f8550b = new cpf(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ cpf f8549a = new cpf(0);

    public /* synthetic */ cpf(int i) {
        this.f8567s = i;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f8567s) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8567s) {
            case 0:
                ((cre) obj).mo5264f();
                break;
            case 1:
                ((cre) obj).mo5266h();
                break;
            case 2:
                ((cre) obj).mo5265g();
                break;
            case 3:
                ctp ctpVar = (ctp) obj;
                if (!ctpVar.mo5504h()) {
                    ctpVar.mo5503g();
                } else {
                    ctpVar.close();
                }
                break;
            case 4:
                ((dbi) obj).mo5842b();
                break;
            case 5:
                ((dbi) obj).mo5841a();
                break;
            case 6:
                ((chs) obj).mo3751a();
                break;
            case 7:
                ((chs) obj).mo3752b();
                break;
            case 8:
                ((InterleavedImageU8) obj).m5007g();
                break;
            case 9:
                ((RawReadView) obj).mo5090a();
                break;
            case 10:
                ((GrayImageS16) obj).m4985a();
                break;
            case 11:
                ((GrayImageS16) obj).m4985a();
                break;
            case 12:
                fbp fbpVar = (fbp) obj;
                int i = fan.f21134e;
                if (fbpVar instanceof fac) {
                    ((fac) fbpVar).mo8077a();
                }
                break;
            case 13:
                fbp fbpVar2 = (fbp) obj;
                int i2 = fan.f21134e;
                if (fbpVar2 instanceof ezu) {
                    ((ezu) fbpVar2).m8075a();
                }
                break;
            case 14:
                fbp fbpVar3 = (fbp) obj;
                int i3 = fan.f21134e;
                if (fbpVar3 instanceof ezp) {
                    ((ezp) fbpVar3).m8072a();
                }
                break;
            case 15:
                fbp fbpVar4 = (fbp) obj;
                int i4 = fan.f21134e;
                if (fbpVar4 instanceof faf) {
                    ((faf) fbpVar4).m8079a();
                }
                break;
            case 16:
                fbp fbpVar5 = (fbp) obj;
                int i5 = fan.f21134e;
                if (fbpVar5 instanceof ftt) {
                }
                break;
            case 17:
                fbp fbpVar6 = (fbp) obj;
                int i6 = fan.f21134e;
                if (fbpVar6 instanceof fad) {
                    ((fad) fbpVar6).m8078a();
                }
                break;
            case 18:
                fbp fbpVar7 = (fbp) obj;
                int i7 = fan.f21134e;
                if (fbpVar7 instanceof ezq) {
                    ((ezq) fbpVar7).m8073a();
                }
                break;
            case 19:
                fbp fbpVar8 = (fbp) obj;
                int i8 = fan.f21134e;
                if (fbpVar8 instanceof gvm) {
                    ((gvm) fbpVar8).m9791b();
                }
                break;
            default:
                fbp fbpVar9 = (fbp) obj;
                int i9 = fan.f21134e;
                if (fbpVar9 instanceof ftt) {
                }
                break;
        }
    }
}

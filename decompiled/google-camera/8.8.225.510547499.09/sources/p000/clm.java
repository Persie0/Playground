package p000;

import android.os.HandlerThread;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class clm implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f6144a;

    public clm(int i) {
        this.f6144a = i;
    }

    /* JADX INFO: renamed from: a */
    public static msn m3919a() {
        msn msnVar = mqt.f41449a;
        msnVar.getClass();
        return msnVar;
    }

    /* JADX INFO: renamed from: b */
    public static final mws m3920b() {
        mws mwsVarM17097l = mws.m17097l(cnp.m3991a("on_shutter", "BOOL"));
        mwsVarM17097l.getClass();
        mws mwsVarM17097l2 = mws.m17097l(cnp.m3991a("photo_mode", "INTEGER"));
        mwsVarM17097l2.getClass();
        mws mwsVarM17098m = mws.m17098m(cnq.m3992a("pixel_data", mwsVarM17097l, new cng(1)), cnq.m3992a("metadata", mwsVarM17097l2, new cng(0)));
        mwsVarM17098m.getClass();
        return mwsVarM17098m;
    }

    /* JADX INFO: renamed from: c */
    public static cwd m3921c() {
        return new cwd((byte[]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f6144a) {
            case 0:
                return new cwd((byte[]) null, (byte[]) null);
            case 1:
                return new jwf(false);
            case 2:
                return new jwf(clv.DISABLED);
            case 3:
                return new jwf(Float.valueOf(0.0f));
            case 4:
                return m3919a();
            case 5:
                return new mpx(m3919a());
            case 6:
                return new cwd((char[]) null);
            case 7:
                throw null;
            case 8:
                return dtj.m6731b("feature.brella.frame.low-res");
            case 9:
                HandlerThread handlerThread = new HandlerThread("f250");
                handlerThread.start();
                return jvh.m13557e(handlerThread.getLooper());
            case 10:
                return jzn.m13827o("VidMedCod", 2);
            case 11:
                return new jwf(false);
            case 12:
                return new cps();
            case 13:
                return new crn();
            case 14:
                return new dhj();
            case 15:
                return m3921c();
            case 16:
                return new cwd();
            case 17:
                return new cvu();
            case 18:
                return kxk.m14965K(ckm.f5985a);
            case 19:
                return new cgw(8);
            default:
                return new cwm();
        }
    }
}

package p000;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lit implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f38328a;

    /* JADX INFO: renamed from: b */
    private final oju f38329b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f38330c;

    public lit(oju ojuVar, oju ojuVar2, int i) {
        this.f38330c = i;
        this.f38328a = ojuVar;
        this.f38329b = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, float[] fArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, int[] iArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    public lit(oju ojuVar, oju ojuVar2, int i, boolean[] zArr) {
        this.f38330c = i;
        this.f38329b = ojuVar;
        this.f38328a = ojuVar2;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f38330c) {
            case 0:
                ((etl) this.f38328a).m7866a();
                return mxk.m17136H((ljh) this.f38329b.get());
            case 1:
                return new lhz(((dws) this.f38329b).m6830a(), (lhz) this.f38328a.get(), null);
            case 2:
                Object objM17136H = !((mrm) ((ohj) this.f38328a).f46012a).mo16813g() ? mzx.f41874a : mxk.m17136H((ljh) this.f38329b.get());
                objM17136H.getClass();
                return objM17136H;
            case 3:
                ((etl) this.f38328a).m7866a();
                return mxk.m17136H((ljh) this.f38329b.get());
            case 4:
                Object objM17136H2 = ((mrm) ((ohj) this.f38328a).f46012a).mo16813g() ? mxk.m17136H((ljh) this.f38329b.get()) : mzx.f41874a;
                objM17136H2.getClass();
                return objM17136H2;
            case 5:
                return new llp((lhz) this.f38329b.get(), (npv) this.f38328a.get());
            case 6:
                Object objM17136H3 = ((mrm) ((ohj) this.f38328a).f46012a).mo16813g() ? mxk.m17136H((llz) this.f38329b.get()) : mzx.f41874a;
                objM17136H3.getClass();
                return objM17136H3;
            case 7:
                ((etl) this.f38328a).m7866a();
                return mxk.m17136H((ljh) this.f38329b.get());
            case 8:
                return new lnc(((dra) this.f38328a).m6617a());
            case 9:
                return new C1058va((mav) this.f38329b.get(), (mrm) ((ohj) this.f38328a).f46012a);
            case 10:
                Context context = (Context) this.f38329b.get();
                Executor executor = (Executor) this.f38328a.get();
                context.getClass();
                executor.getClass();
                aps apsVarM348g = aek.m348g(context, F250RoomDatabase.class, "f250-room-database");
                apsVarM348g.f2048b = executor;
                apsVarM348g.m1814b(lyw.f39560a);
                apsVarM348g.m1814b(lyw.f39561b);
                apsVarM348g.m1814b(lyw.f39562c);
                apsVarM348g.m1814b(lyw.f39563d);
                apsVarM348g.m1814b(lyw.f39564e);
                apsVarM348g.m1814b(lyw.f39565f);
                apsVarM348g.m1814b(lyw.f39566g);
                apsVarM348g.m1814b(lyw.f39569j);
                apsVarM348g.m1814b(lyw.f39568i);
                apsVarM348g.m1814b(lyw.f39567h);
                apsVarM348g.m1814b(lyw.f39570k);
                apsVarM348g.m1814b(lyw.f39574o);
                apsVarM348g.m1814b(lyw.f39573n);
                apsVarM348g.m1814b(lyw.f39572m);
                apsVarM348g.m1814b(lyw.f39571l);
                apsVarM348g.m1814b(lyw.f39575p);
                apsVarM348g.m1814b(lyw.f39580u);
                apsVarM348g.m1814b(lyw.f39579t);
                apsVarM348g.m1814b(lyw.f39578s);
                apsVarM348g.m1814b(lyw.f39577r);
                apsVarM348g.m1814b(lyw.f39576q);
                F250RoomDatabase f250RoomDatabase = (F250RoomDatabase) apsVarM348g.m1813a();
                f250RoomDatabase.getClass();
                return f250RoomDatabase;
            case 11:
                Context context2 = (Context) this.f38329b.get();
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) this.f38328a.get();
                context2.getClass();
                googleSignInOptions.getClass();
                return jbx.m12858c(context2, googleSignInOptions);
            case 12:
                return new mcc(((mcb) this.f38328a).get(), ((mbm) this.f38329b).get());
            default:
                return new mmx(((dws) this.f38328a).m6830a(), (mav) this.f38329b.get(), null, null);
        }
    }
}

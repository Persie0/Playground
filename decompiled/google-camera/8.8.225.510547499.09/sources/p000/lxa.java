package p000;

import android.content.Context;
import androidx.wear.ambient.AmbientMode;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lxa implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f39497a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39498b;

    public lxa(oju ojuVar, int i) {
        this.f39498b = i;
        this.f39497a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Executor executorMo18970c;
        switch (this.f39498b) {
            case 0:
                Context context = (Context) this.f39497a.get();
                context.getClass();
                File filesDir = context.getFilesDir();
                filesDir.getClass();
                return omn.m18708m(filesDir, "f250");
            case 1:
                File file = (File) this.f39497a.get();
                file.getClass();
                return new AmbientMode.AmbientController(file);
            case 2:
                return new lyz(this.f39497a);
            case 3:
                F250RoomDatabase f250RoomDatabase = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase.getClass();
                lxd lxdVarMo4723w = f250RoomDatabase.mo4723w();
                lxdVarMo4723w.getClass();
                return lxdVarMo4723w;
            case 4:
                F250RoomDatabase f250RoomDatabase2 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase2.getClass();
                lxn lxnVarMo4724x = f250RoomDatabase2.mo4724x();
                lxnVarMo4724x.getClass();
                return lxnVarMo4724x;
            case 5:
                F250RoomDatabase f250RoomDatabase3 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase3.getClass();
                lxs lxsVarMo4725y = f250RoomDatabase3.mo4725y();
                lxsVarMo4725y.getClass();
                return lxsVarMo4725y;
            case 6:
                F250RoomDatabase f250RoomDatabase4 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase4.getClass();
                lxw lxwVarMo4726z = f250RoomDatabase4.mo4726z();
                lxwVarMo4726z.getClass();
                return lxwVarMo4726z;
            case 7:
                F250RoomDatabase f250RoomDatabase5 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase5.getClass();
                lyz lyzVarMo4719A = f250RoomDatabase5.mo4719A();
                lyzVarMo4719A.getClass();
                return lyzVarMo4719A;
            case 8:
                F250RoomDatabase f250RoomDatabase6 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase6.getClass();
                lzd lzdVarMo4720B = f250RoomDatabase6.mo4720B();
                lzdVarMo4720B.getClass();
                return lzdVarMo4720B;
            case 9:
                F250RoomDatabase f250RoomDatabase7 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase7.getClass();
                lzh lzhVarMo4721C = f250RoomDatabase7.mo4721C();
                lzhVarMo4721C.getClass();
                return lzhVarMo4721C;
            case 10:
                F250RoomDatabase f250RoomDatabase8 = (F250RoomDatabase) this.f39497a.get();
                f250RoomDatabase8.getClass();
                lzv lzvVarMo4722D = f250RoomDatabase8.mo4722D();
                lzvVarMo4722D.getClass();
                return lzvVarMo4722D;
            case 11:
                jbc jbcVar = (jbc) this.f39497a.get();
                jbcVar.getClass();
                return new maq(jbcVar);
            case 12:
                return (oqo) ((mrm) ((ohj) this.f39497a).f46012a).mo16811e(ord.f46447b);
            case 13:
                oqo oqoVar = (oqo) this.f39497a.get();
                oqoVar.getClass();
                orq orqVar = oqoVar instanceof orq ? (orq) oqoVar : null;
                return (orqVar == null || (executorMo18970c = orqVar.mo18970c()) == null) ? new orc(oqoVar) : executorMo18970c;
            case 14:
                Context context2 = (Context) this.f39497a.get();
                context2.getClass();
                return azp.m2125e(context2);
            case 15:
                return new lzd((lij) this.f39497a.get(), null, null);
            case 16:
                return new mng(((dws) this.f39497a).m6830a());
            case 17:
                mms mmsVar = (mms) this.f39497a.get();
                mmsVar.getClass();
                return mmsVar;
            default:
                return new mav(((dws) this.f39497a).m6830a());
        }
    }
}

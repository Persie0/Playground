package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.Meaning;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;
import p367rh.C8787a;

/* JADX INFO: renamed from: bi.e */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1420e implements Callable<C8787a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8384a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8385b;

    public CallableC1420e(C1404c c1404c, C6595o c6595o) {
        this.f8385b = c1404c;
        this.f8384a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C8787a call() throws Exception {
        C1404c c1404c = this.f8385b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        C6595o c6595o = this.f8384a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            C8787a c8787a = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                int i10 = cursorM16698S0.getInt(1);
                int i11 = cursorM16698S0.getInt(2);
                Integer numValueOf = cursorM16698S0.isNull(3) ? null : Integer.valueOf(cursorM16698S0.getInt(3));
                String string3 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                String string4 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                List<Meaning> listM5002m = c1405c0.m5002m(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                String string5 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8));
                if (!cursorM16698S0.isNull(9)) {
                    string = cursorM16698S0.getString(9);
                }
                c8787a = new C8787a(i10, string2, i11, numValueOf, listM4992l, C1405c0.m4992l(string), string4, listM5002m, string5, string3);
            }
            return c8787a;
        } finally {
            cursorM16698S0.close();
            c6595o.m13198q();
        }
    }
}

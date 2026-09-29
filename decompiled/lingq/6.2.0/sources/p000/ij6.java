package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.firebase.components.DependencyException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ij6 implements w92, aj2, fk8, mf9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44188a;

    public /* synthetic */ ij6(int i) {
        this.f44188a = i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m13946b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13947d(int i, Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + i + obj + obj2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m13948e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m13949f(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13950g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m13951i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13952j(String str, float f) {
        throw new IllegalArgumentException(str + f);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13953k(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m13954l(String str, Object obj, Object obj2) throws GeneralSecurityException {
        throw new GeneralSecurityException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m13955m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m13956n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m13957o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m13958p(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m13959q() {
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m13960r(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m13961s(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m13962t(String str, Object obj, Object obj2) {
        throw new DependencyException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m13963u(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m13964v(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m13965w(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m13966x(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m13967y(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // p000.mf9
    /* JADX INFO: renamed from: a */
    public boolean mo13968a() {
        return false;
    }

    @Override // p000.fk8
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                C3309ls c3309lsM19658a = q50.m19658a();
                c3309lsM19658a.m16496P(cursorRawQuery.getString(1));
                c3309lsM19658a.f50066d = mk7.m16870b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                c3309lsM19658a.f50065c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(c3309lsM19658a.m16506f());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // p000.aj2
    /* JADX INFO: renamed from: c */
    public double mo503c(double d) {
        return d;
    }

    @Override // p000.w92
    /* JADX INFO: renamed from: h */
    public void mo13969h(uo7 uo7Var) {
    }
}

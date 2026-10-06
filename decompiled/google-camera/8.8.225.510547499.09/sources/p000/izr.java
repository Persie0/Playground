package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class izr {

    /* JADX INFO: renamed from: b */
    public final izv f32723b;

    protected izr(izv izvVar) {
        this.f32723b = izvVar;
    }

    /* JADX INFO: renamed from: a */
    private static String m11921a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    /* JADX INFO: renamed from: l */
    protected static String m11922l(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String strM11921a = m11921a(obj);
        String strM11921a2 = m11921a(obj2);
        String strM11921a3 = m11921a(obj3);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strM11921a)) {
            sb.append(str2);
            sb.append(strM11921a);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strM11921a2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strM11921a2);
        }
        if (!TextUtils.isEmpty(strM11921a3)) {
            sb.append(str3);
            sb.append(strM11921a3);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static final void m11923x() {
    }

    /* JADX INFO: renamed from: d */
    public final Context m11924d() {
        return this.f32723b.f32728a;
    }

    /* JADX INFO: renamed from: e */
    protected final izo m11925e() {
        return this.f32723b.m11949a();
    }

    /* JADX INFO: renamed from: f */
    public final izq m11926f() {
        return this.f32723b.m11950b();
    }

    /* JADX INFO: renamed from: g */
    protected final jah m11927g() {
        return this.f32723b.f32730c;
    }

    /* JADX INFO: renamed from: h */
    protected final jak m11928h() {
        izv izvVar = this.f32723b;
        izv.m11948f(izvVar.f32732e);
        return izvVar.f32732e;
    }

    /* JADX INFO: renamed from: i */
    protected final jar m11929i() {
        return this.f32723b.m11951d();
    }

    /* JADX INFO: renamed from: j */
    public final jau m11930j() {
        izv izvVar = this.f32723b;
        izv.m11948f(izvVar.f32733f);
        return izvVar.f32733f;
    }

    /* JADX INFO: renamed from: k */
    protected final jaz m11931k() {
        return this.f32723b.m11952e();
    }

    /* JADX INFO: renamed from: m */
    public final void m11932m(String str, Object obj) {
        m11942w(3, str, obj, null, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m11933n(String str) {
        m11942w(6, str, null, null, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m11934o(String str, Object obj) {
        m11942w(6, str, obj, null, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m11935p(String str, Object obj, Object obj2) {
        m11942w(6, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m11936q(String str) {
        m11942w(2, str, null, null, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m11937r(String str, Object obj) {
        m11942w(2, str, obj, null, null);
    }

    /* JADX INFO: renamed from: s */
    public final void m11938s(String str, Object obj, Object obj2) {
        m11942w(2, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m11939t(String str) {
        m11942w(5, str, null, null, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m11940u(String str, Object obj) {
        m11942w(5, str, obj, null, null);
    }

    /* JADX INFO: renamed from: v */
    public final void m11941v(String str, Object obj, Object obj2) {
        m11942w(5, str, obj, obj2, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m11942w(int i, String str, Object obj, Object obj2, Object obj3) {
        jar jarVar = this.f32723b.f32731d;
        if (jarVar == null) {
            String str2 = (String) jam.f33580b.m11334D();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, m11922l(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) jam.f33580b.m11334D();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, jar.m11922l(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            jarVar.m12791c(i, str, obj, obj2, obj3);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m11943y() {
    }
}

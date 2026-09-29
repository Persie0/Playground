package androidx.activity.result;

import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import com.clevertap.android.sdk.C2181a;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.encoders.proto.C3216a;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.JsonReader;
import dm.C5207g;
import dm.C5209i;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import km.InterfaceC6725h;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.json.JSONException;
import p174i9.InterfaceC6208b;
import p261m9.InterfaceC7507h;
import p261m9.InterfaceC7511l;
import p319p9.C8209b;
import p479xa.C10144m;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: androidx.activity.result.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0204c implements C10144m.a, InterfaceC0202a, InterfaceC7511l {
    public /* synthetic */ C0204c() {
    }

    public /* synthetic */ C0204c(int i10, InterfaceC6208b.a aVar, boolean z10) {
    }

    /* JADX INFO: renamed from: d */
    public static float m845d(float f3, float f10, float f11, float f12) {
        return ((f3 - f10) * f11) + f12;
    }

    /* JADX INFO: renamed from: e */
    public static int m846e(float f3, int i10, int i11) {
        return (Float.hashCode(f3) + i10) * i11;
    }

    /* JADX INFO: renamed from: f */
    public static int m847f(long j10, int i10, int i11) {
        return (Long.hashCode(j10) + i10) * i11;
    }

    /* JADX INFO: renamed from: g */
    public static int m848g(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: h */
    public static View m849h(RecyclerView recyclerView, int i10, RecyclerView recyclerView2, boolean z10) {
        return LayoutInflater.from(recyclerView.getContext()).inflate(i10, recyclerView2, z10);
    }

    /* JADX INFO: renamed from: i */
    public static Integer m850i(JsonReader jsonReader, String str, int i10) throws IOException {
        C5207g.m11111f(jsonReader, str);
        Integer numValueOf = Integer.valueOf(i10);
        jsonReader.mo10504b();
        return numValueOf;
    }

    /* JADX INFO: renamed from: j */
    public static String m851j(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    /* JADX INFO: renamed from: k */
    public static String m852k(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m853l(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m854m(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m855o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    /* JADX INFO: renamed from: p */
    public static HashMap m856p(Class cls, C3216a c3216a) {
        HashMap map = new HashMap();
        map.put(cls, c3216a);
        return map;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC6725h m857q(Class cls, String str) {
        return C5209i.m11120c(new PropertyReference1Impl(cls, str));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m858r() {
    }

    /* JADX INFO: renamed from: s */
    public static void m859s(double d10, AbstractC4949k abstractC4949k, AbstractC9310n abstractC9310n, String str) throws IOException {
        abstractC4949k.mo9386f(abstractC9310n, Double.valueOf(d10));
        abstractC9310n.mo10551C(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m860t(FrameworkSQLiteDatabase frameworkSQLiteDatabase, String str, String str2, String str3, String str4) {
        frameworkSQLiteDatabase.mo4600u(str);
        frameworkSQLiteDatabase.mo4600u(str2);
        frameworkSQLiteDatabase.mo4600u(str3);
        frameworkSQLiteDatabase.mo4600u(str4);
    }

    /* JADX INFO: renamed from: u */
    public static void m861u(Number number, InterfaceC0500b interfaceC0500b, String str, InterfaceC0476a interfaceC0476a, int i10) {
        number.intValue();
        C5207g.m11111f(interfaceC0500b, str);
        interfaceC0476a.mo1622c(i10);
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m862v(Object obj) {
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static void m863w(JSONException jSONException, StringBuilder sb2) {
        sb2.append(jSONException.getLocalizedMessage());
        C2181a.m6455h(sb2.toString());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m864x() {
    }

    @Override // androidx.activity.result.InterfaceC0202a
    /* JADX INFO: renamed from: a */
    public void mo843a(Object obj) {
        int i10 = LoginButton.f11670U;
    }

    @Override // p261m9.InterfaceC7511l
    /* JADX INFO: renamed from: b */
    public InterfaceC7507h[] mo34b() {
        return new InterfaceC7507h[]{new C8209b()};
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        ((InterfaceC6208b) obj).getClass();
    }
}

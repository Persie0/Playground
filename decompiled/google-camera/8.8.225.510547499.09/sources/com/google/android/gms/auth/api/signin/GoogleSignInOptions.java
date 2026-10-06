package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C0870ob;
import p000.C1143ye;
import p000.jbd;
import p000.jbp;
import p000.jdt;
import p000.jij;
import p000.jiy;
import p000.luc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends jij implements ReflectedParcelable, jdt {
    public static final Parcelable.Creator CREATOR;

    /* JADX INFO: renamed from: a */
    public static final Scope f7570a;

    /* JADX INFO: renamed from: b */
    public static final Scope f7571b;

    /* JADX INFO: renamed from: c */
    public static final Scope f7572c;

    /* JADX INFO: renamed from: d */
    public static final Scope f7573d;

    /* JADX INFO: renamed from: e */
    public static final Scope f7574e;

    /* JADX INFO: renamed from: f */
    public static final GoogleSignInOptions f7575f;

    /* JADX INFO: renamed from: g */
    public static final Comparator f7576g;

    /* JADX INFO: renamed from: h */
    final int f7577h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f7578i;

    /* JADX INFO: renamed from: j */
    public final Account f7579j;

    /* JADX INFO: renamed from: k */
    public final boolean f7580k;

    /* JADX INFO: renamed from: l */
    public final boolean f7581l;

    /* JADX INFO: renamed from: m */
    public final boolean f7582m;

    /* JADX INFO: renamed from: n */
    public final String f7583n;

    /* JADX INFO: renamed from: o */
    public final String f7584o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f7585p;

    /* JADX INFO: renamed from: q */
    public final String f7586q;

    static {
        Scope scope = new Scope("profile");
        f7570a = scope;
        f7571b = new Scope("email");
        f7572c = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        f7573d = scope2;
        f7574e = new Scope("https://www.googleapis.com/auth/games");
        jbd jbdVar = new jbd();
        jbdVar.m12831b();
        jbdVar.f33646a.add(scope);
        f7575f = jbdVar.m12830a();
        jbd jbdVar2 = new jbd();
        jbdVar2.m12832c(scope2, new Scope[0]);
        jbdVar2.m12830a();
        CREATOR = new C0870ob(19);
        f7576g = new C1143ye(7);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.f7577h = i;
        this.f7578i = arrayList;
        this.f7579j = account;
        this.f7580k = z;
        this.f7581l = z2;
        this.f7582m = z3;
        this.f7583n = str;
        this.f7584o = str2;
        this.f7585p = new ArrayList(map.values());
        this.f7586q = str3;
    }

    /* JADX INFO: renamed from: b */
    public static Map m4637b(List list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jbp jbpVar = (jbp) it.next();
            map.put(Integer.valueOf(jbpVar.f33668b), jbpVar);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m4638a() {
        return new ArrayList(this.f7578i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0068 A[Catch: ClassCastException -> 0x0083, TryCatch #0 {ClassCastException -> 0x0083, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x0046, B:24:0x004e, B:30:0x0062, B:32:0x0068, B:34:0x006e, B:36:0x0074, B:27:0x0057, B:20:0x003e), top: B:45:0x0004 }] */
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f7585p.size() <= 0 && googleSignInOptions.f7585p.size() <= 0 && this.f7578i.size() == googleSignInOptions.m4638a().size() && this.f7578i.containsAll(googleSignInOptions.m4638a())) {
                Account account = this.f7579j;
                if (account == null) {
                    if (googleSignInOptions.f7579j == null) {
                        if (TextUtils.isEmpty(this.f7583n)) {
                            if (TextUtils.isEmpty(googleSignInOptions.f7583n)) {
                                if (this.f7582m != googleSignInOptions.f7582m && this.f7580k == googleSignInOptions.f7580k && this.f7581l == googleSignInOptions.f7581l && TextUtils.equals(this.f7586q, googleSignInOptions.f7586q)) {
                                    return true;
                                }
                            }
                        } else if (!this.f7583n.equals(googleSignInOptions.f7583n)) {
                            if (this.f7582m != googleSignInOptions.f7582m) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.f7579j)) {
                    if (TextUtils.isEmpty(this.f7583n)) {
                        if (TextUtils.isEmpty(googleSignInOptions.f7583n)) {
                            if (this.f7582m != googleSignInOptions.f7582m) {
                            }
                        }
                    } else if (!this.f7583n.equals(googleSignInOptions.f7583n)) {
                        if (this.f7582m != googleSignInOptions.f7582m) {
                        }
                    }
                }
                return false;
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7578i;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f7600b);
        }
        Collections.sort(arrayList);
        luc lucVar = new luc((byte[]) null);
        lucVar.m15986b(arrayList);
        lucVar.m15986b(this.f7579j);
        lucVar.m15986b(this.f7583n);
        lucVar.m15985a(this.f7582m);
        lucVar.m15985a(this.f7580k);
        lucVar.m15985a(this.f7581l);
        lucVar.m15986b(this.f7586q);
        return lucVar.f39211a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7577h);
        jiy.m13239A(parcel, 2, m4638a());
        jiy.m13295v(parcel, 3, this.f7579j, i);
        jiy.m13284k(parcel, 4, this.f7580k);
        jiy.m13284k(parcel, 5, this.f7581l);
        jiy.m13284k(parcel, 6, this.f7582m);
        jiy.m13296w(parcel, 7, this.f7583n);
        jiy.m13296w(parcel, 8, this.f7584o);
        jiy.m13239A(parcel, 9, this.f7585p);
        jiy.m13296w(parcel, 10, this.f7586q);
        jiy.m13283j(parcel, iM13281h);
    }
}

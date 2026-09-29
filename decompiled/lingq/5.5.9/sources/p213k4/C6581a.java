package p213k4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import dm.C5207g;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p234l4.InterfaceC7251a;
import p288o4.InterfaceC7917c;

/* JADX INFO: renamed from: k4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6581a {

    /* JADX INFO: renamed from: a */
    public final Context f37406a;

    /* JADX INFO: renamed from: b */
    public final String f37407b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7917c.c f37408c;

    /* JADX INFO: renamed from: d */
    public final RoomDatabase.C1182c f37409d;

    /* JADX INFO: renamed from: e */
    public final List<RoomDatabase.AbstractC1181b> f37410e;

    /* JADX INFO: renamed from: f */
    public final boolean f37411f;

    /* JADX INFO: renamed from: g */
    public final RoomDatabase.JournalMode f37412g;

    /* JADX INFO: renamed from: h */
    public final Executor f37413h;

    /* JADX INFO: renamed from: i */
    public final Executor f37414i;

    /* JADX INFO: renamed from: j */
    public final Intent f37415j;

    /* JADX INFO: renamed from: k */
    public final boolean f37416k;

    /* JADX INFO: renamed from: l */
    public final boolean f37417l;

    /* JADX INFO: renamed from: m */
    public final Set<Integer> f37418m;

    /* JADX INFO: renamed from: n */
    public final Callable<InputStream> f37419n;

    /* JADX INFO: renamed from: o */
    public final List<Object> f37420o;

    /* JADX INFO: renamed from: p */
    public final List<InterfaceC7251a> f37421p;

    /* JADX INFO: renamed from: q */
    public final boolean f37422q;

    @SuppressLint({"LambdaLast"})
    public C6581a(Context context, String str, InterfaceC7917c.c cVar, RoomDatabase.C1182c c1182c, ArrayList arrayList, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z11, boolean z12, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(c1182c, "migrationContainer");
        C5207g.m11111f(journalMode, "journalMode");
        C5207g.m11111f(arrayList2, "typeConverters");
        C5207g.m11111f(arrayList3, "autoMigrationSpecs");
        this.f37406a = context;
        this.f37407b = str;
        this.f37408c = cVar;
        this.f37409d = c1182c;
        this.f37410e = arrayList;
        this.f37411f = z10;
        this.f37412g = journalMode;
        this.f37413h = executor;
        this.f37414i = executor2;
        this.f37415j = null;
        this.f37416k = z11;
        this.f37417l = z12;
        this.f37418m = linkedHashSet;
        this.f37419n = null;
        this.f37420o = arrayList2;
        this.f37421p = arrayList3;
        this.f37422q = false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m13168a(int i10, int i11) {
        Set<Integer> set;
        if ((i10 > i11) && this.f37417l) {
            return false;
        }
        return this.f37416k && ((set = this.f37418m) == null || !set.contains(Integer.valueOf(i10)));
    }
}

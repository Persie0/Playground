package p382s7;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import androidx.activity.RunnableC0183b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.appevents.p050ml.ModelManager;
import com.google.android.datatransport.Priority;
import com.google.android.exoplayer2.C2384d0;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.firebase.messaging.AbstractServiceC3245h;
import com.lingq.p055ui.home.HomeFragment;
import com.lingq.p055ui.home.challenges.ChallengesFragment;
import com.lingq.p055ui.home.course.CoursePlaylistFragment;
import dm.C5207g;
import ga.C5726i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import p045c9.C1753g;
import p067d8.C5074n;
import p068d9.AbstractC5091e;
import p068d9.AbstractC5095i;
import p068d9.C5088b;
import p068d9.C5104r;
import p090e9.InterfaceC5385a;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5747c;
import p173i8.C6205a;
import p174i9.C6236z;
import p174i9.InterfaceC6208b;
import p218k9.C6635e;
import p291o7.C7993c0;
import p291o7.C8004n;
import p402u0.C9369l;
import p452w8.AbstractC9838s;
import p452w8.C9827h;
import p476x7.AsyncTaskC10108g;
import p479xa.C10141j;
import p479xa.C10144m;
import p502y7.C10301b;
import p505ya.C10332n;
import ph.C8273e;
import ph.C8309k;

/* JADX INFO: renamed from: s7.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8969b implements C8975h.a, AsyncTaskC10108g.a, InterfaceC5385a.a, C5104r.a, C10144m.b, C10144m.a, InterfaceC5747c, SwipeRefreshLayout.InterfaceC1198f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f46996b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f46997c;

    public /* synthetic */ C8969b(Object obj, int i10, Object obj2) {
        this.f46995a = i10;
        this.f46996b = obj;
        this.f46997c = obj2;
    }

    @Override // p476x7.AsyncTaskC10108g.a
    /* JADX INFO: renamed from: a */
    public final void mo17198a(File file) {
        ModelManager.C2297a c2297a = (ModelManager.C2297a) this.f46996b;
        C10301b c10301b = (C10301b) this.f46997c;
        C5207g.m11111f(c2297a, "$slave");
        C5207g.m11111f(file, "file");
        c2297a.f11535g = c10301b;
        c2297a.f11534f = file;
        Runnable runnable = c2297a.f11536h;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        C5104r c5104r = (C5104r) this.f46996b;
        AbstractC9838s abstractC9838s = (AbstractC9838s) this.f46997c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        AbstractC5091e abstractC5091e = c5104r.f33059d;
        ArrayList arrayListM10869G = c5104r.m10869G(sQLiteDatabase, abstractC9838s, abstractC5091e.mo10846c());
        for (Priority priority : Priority.values()) {
            if (priority != abstractC9838s.mo18321d()) {
                int iMo10846c = abstractC5091e.mo10846c() - arrayListM10869G.size();
                if (iMo10846c <= 0) {
                    break;
                }
                arrayListM10869G.addAll(c5104r.m10869G(sQLiteDatabase, abstractC9838s.m18331e(priority), iMo10846c));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < arrayListM10869G.size(); i10++) {
            sb2.append(((AbstractC5095i) arrayListM10869G.get(i10)).mo10850b());
            if (i10 < arrayListM10869G.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        C5104r.m10867Q(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new C9369l(8, map));
        ListIterator listIterator = arrayListM10869G.listIterator();
        while (listIterator.hasNext()) {
            AbstractC5095i abstractC5095i = (AbstractC5095i) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC5095i.mo10850b()))) {
                C9827h.a aVarM18327i = abstractC5095i.mo10849a().m18327i();
                for (C5104r.b bVar : (Set) map.get(Long.valueOf(abstractC5095i.mo10850b()))) {
                    aVarM18327i.m18328a(bVar.f33061a, bVar.f33062b);
                }
                listIterator.set(new C5088b(abstractC5095i.mo10850b(), abstractC5095i.mo10851c(), aVarM18327i.m18311b()));
            }
        }
        return arrayListM10869G;
    }

    @Override // p479xa.C10144m.b
    /* JADX INFO: renamed from: b */
    public final void mo12344b(Object obj, C10141j c10141j) {
        InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
        interfaceC6208b.mo12807u((InterfaceC2532v) this.f46997c, new InterfaceC6208b.b(c10141j, ((C6236z) this.f46996b).f36222e));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1198f
    /* JADX INFO: renamed from: c */
    public final void mo4616c() {
        int i10 = this.f46995a;
        Object obj = this.f46997c;
        Object obj2 = this.f46996b;
        switch (i10) {
            case 12:
                ChallengesFragment.m9792o0((ChallengesFragment) obj2, (C8273e) obj);
                break;
            default:
                CoursePlaylistFragment.m9859n0((CoursePlaylistFragment) obj2, (C8309k) obj);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #1 {all -> 0x0079, blocks: (B:26:0x005e, B:29:0x0063), top: B:40:0x005e, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m17199d() {
        C8970c c8970c;
        C5074n c5074n = (C5074n) this.f46996b;
        String str = (String) this.f46997c;
        if (C6205a.m12742b(C8970c.class)) {
            return;
        }
        try {
            C5207g.m11111f(str, "$appId");
            boolean zM15858a = false;
            boolean z10 = c5074n != null && c5074n.f32976j;
            C8004n c8004n = C8004n.f43550a;
            C7993c0 c7993c0 = C7993c0.f43496a;
            if (!C6205a.m12742b(C7993c0.class)) {
                try {
                    C7993c0.f43496a.m15851d();
                    zM15858a = C7993c0.f43503h.m15858a();
                } catch (Throwable th2) {
                    C6205a.m12741a(C7993c0.class, th2);
                }
                if (z10) {
                    c8970c = C8970c.f46998a;
                    c8970c.getClass();
                    if (C6205a.m12742b(c8970c)) {
                        return;
                    }
                    if (C8970c.f47005h) {
                        return;
                    }
                    C8970c.f47005h = true;
                    C8004n.m15873c().execute(new RunnableC0183b(8, str));
                    return;
                    C6205a.m12741a(C8970c.class, th);
                }
            } else if (z10 && zM15858a) {
                c8970c = C8970c.f46998a;
                c8970c.getClass();
                if (C6205a.m12742b(c8970c)) {
                    return;
                }
                try {
                    if (C8970c.f47005h) {
                        return;
                    }
                    C8970c.f47005h = true;
                    C8004n.m15873c().execute(new RunnableC0183b(8, str));
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(c8970c, th3);
                    return;
                }
                C6205a.m12741a(C8970c.class, th);
            }
        } catch (Throwable th4) {
            C6205a.m12741a(C8970c.class, th4);
        }
    }

    @Override // p136gc.InterfaceC5747c
    /* JADX INFO: renamed from: e */
    public final void mo205e(AbstractC5751g abstractC5751g) {
        int i10 = this.f46995a;
        Object obj = this.f46997c;
        Object obj2 = this.f46996b;
        switch (i10) {
            case 10:
                ((AbstractServiceC3245h) obj2).lambda$onStartCommand$1((Intent) obj, abstractC5751g);
                break;
            default:
                HomeFragment.m9765n0((AbstractC5751g) obj2, (HomeFragment) obj, abstractC5751g);
                break;
        }
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        C1753g c1753g = (C1753g) this.f46996b;
        c1753g.f9632c.mo10863o((Iterable) this.f46997c);
        return null;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f46995a;
        Object obj2 = this.f46997c;
        Object obj3 = this.f46996b;
        switch (i10) {
            case 5:
                ((InterfaceC6208b) obj).mo12784S((InterfaceC6208b.a) obj3, (C2384d0) obj2);
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((InterfaceC6208b) obj).mo12782Q((InterfaceC6208b.a) obj3, (C5726i) obj2);
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ((InterfaceC6208b) obj).mo12795i((InterfaceC6208b.a) obj3, (C6635e) obj2);
                break;
            case 8:
                ((InterfaceC6208b) obj).getClass();
                break;
            default:
                C10332n c10332n = (C10332n) obj2;
                ((InterfaceC6208b) obj).mo12790d((InterfaceC6208b.a) obj3, c10332n);
                int i11 = c10332n.f52016a;
                break;
        }
    }
}

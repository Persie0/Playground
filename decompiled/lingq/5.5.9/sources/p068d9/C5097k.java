package p068d9;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.exoplayer2.PlaybackException;
import com.google.common.collect.AbstractC3177a0;
import com.google.common.collect.ImmutableList;
import com.google.firebase.messaging.C3246i;
import com.lingq.p055ui.home.challenges.ChallengeDetailsFragment;
import com.lingq.p055ui.home.course.CourseFragment;
import com.lingq.p055ui.home.search.SearchFragment;
import ga.C5735r;
import java.util.List;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5745a;
import p174i9.InterfaceC6208b;
import p208k.ExecutorC6559b;
import p402u0.C9362e;
import p452w8.AbstractC9838s;
import p479xa.C10144m;
import ph.C8279f;
import ph.C8346q1;
import ph.C8364u;
import ua.C9496e;

/* JADX INFO: renamed from: d9.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5097k implements C5104r.a, C10144m.a, C9496e.g.a, InterfaceC5745a, SwipeRefreshLayout.InterfaceC1198f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33039c;

    public /* synthetic */ C5097k(Object obj, int i10, Object obj2) {
        this.f33037a = i10;
        this.f33038b = obj;
        this.f33039c = obj2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        C5104r c5104r = (C5104r) this.f33038b;
        AbstractC9838s abstractC9838s = (AbstractC9838s) this.f33039c;
        c5104r.getClass();
        Long lM10865C = C5104r.m10865C((SQLiteDatabase) obj, abstractC9838s);
        if (lM10865C == null) {
            return Boolean.FALSE;
        }
        Cursor cursorRawQuery = c5104r.m10871r().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM10865C.toString()});
        try {
            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
            cursorRawQuery.close();
            return boolValueOf;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // ua.C9496e.g.a
    /* JADX INFO: renamed from: b */
    public final List mo10864b(int i10, C5735r c5735r, int[] iArr) {
        C9496e.c cVar = (C9496e.c) this.f33038b;
        String str = (String) this.f33039c;
        AbstractC3177a0<Integer> abstractC3177a0 = C9496e.f48797j;
        ImmutableList.C3147b c3147b = ImmutableList.f16043b;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        for (int i11 = 0; i11 < c5735r.f34800a; i11++) {
            c3146a.m9055b(new C9496e.f(i10, c5735r, i11, cVar, iArr[i11], str));
        }
        return c3146a.m9068e();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC1198f
    /* JADX INFO: renamed from: c */
    public final void mo4616c() {
        int i10 = this.f33037a;
        Object obj = this.f33039c;
        Object obj2 = this.f33038b;
        switch (i10) {
            case 8:
                ChallengeDetailsFragment.m9783o0((ChallengeDetailsFragment) obj2, (C8279f) obj);
                break;
            case 9:
                CourseFragment.m9855n0((CourseFragment) obj2, (C8364u) obj);
                break;
            default:
                SearchFragment.m10010n0((SearchFragment) obj2, (C8346q1) obj);
                break;
        }
    }

    @Override // p136gc.InterfaceC5745a
    /* JADX INFO: renamed from: i */
    public final Object mo5485i(AbstractC5751g abstractC5751g) {
        Context context = (Context) this.f33038b;
        Intent intent = (Intent) this.f33039c;
        Object obj = C3246i.f16394c;
        return ((Integer) abstractC5751g.mo12107i()).intValue() != 402 ? abstractC5751g : C3246i.m9262a(context, intent).mo12104f(new ExecutorC6559b(2), new C9362e(27));
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f33037a;
        Object obj2 = this.f33038b;
        switch (i10) {
            case 1:
                ((InterfaceC6208b) obj).getClass();
                break;
            case 2:
                ((InterfaceC6208b) obj).getClass();
                break;
            case 3:
                ((InterfaceC6208b) obj).getClass();
                break;
            case 4:
                ((InterfaceC6208b) obj).mo12792f((InterfaceC6208b.a) obj2, (PlaybackException) this.f33039c);
                break;
            default:
                ((InterfaceC6208b) obj).mo12810x((InterfaceC6208b.a) obj2);
                break;
        }
    }
}

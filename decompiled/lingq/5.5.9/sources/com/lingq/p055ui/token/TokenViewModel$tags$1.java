package com.lingq.p055ui.token;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import li.InterfaceC7379f;
import p138gk.C5817g;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u008a@"}, m13365d2 = {"", "", "tags", "Lli/f;", "token", "Lcom/lingq/ui/token/TokenViewState;", "state", "", "Lgk/g$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$tags$1", m19206f = "TokenViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class TokenViewModel$tags$1 extends SuspendLambda implements InterfaceC2058r<List<? extends String>, InterfaceC7379f, TokenViewState, InterfaceC9968c<? super List<C5817g.a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f31658e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7379f f31659f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ TokenViewState f31660g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TokenViewModel f31661h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$tags$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$tags$1> interfaceC9968c) {
        super(4, interfaceC9968c);
        this.f31661h = tokenViewModel;
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(List<? extends String> list, InterfaceC7379f interfaceC7379f, TokenViewState tokenViewState, InterfaceC9968c<? super List<C5817g.a>> interfaceC9968c) {
        TokenViewModel$tags$1 tokenViewModel$tags$1 = new TokenViewModel$tags$1(this.f31661h, interfaceC9968c);
        tokenViewModel$tags$1.f31658e = list;
        tokenViewModel$tags$1.f31659f = interfaceC7379f;
        tokenViewModel$tags$1.f31660g = tokenViewState;
        return tokenViewModel$tags$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f31658e;
        InterfaceC7379f interfaceC7379f = this.f31659f;
        TokenViewState tokenViewState = this.f31660g;
        ArrayList arrayList = new ArrayList();
        List<String> listMo14775d = interfaceC7379f.mo14775d();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listMo14775d, 10));
        Iterator<T> it = listMo14775d.iterator();
        while (it.hasNext()) {
            String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList2.add(lowerCase);
        }
        List<String> listMo14773b = interfaceC7379f.mo14773b();
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listMo14773b, 10));
        Iterator<T> it2 = listMo14773b.iterator();
        while (it2.hasNext()) {
            String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList3.add(lowerCase2);
        }
        ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList3, arrayList2);
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            String lowerCase3 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            arrayList4.add(lowerCase3);
        }
        Set setM13457y0 = C6752c.m13457y0(C6752c.m13438f0(arrayList4, arrayListM13438f0));
        ArrayList<String> arrayList5 = new ArrayList();
        Iterator it4 = setM13457y0.iterator();
        loop3: while (true) {
            while (true) {
                boolean z10 = true;
                if (!it4.hasNext()) {
                    break loop3;
                }
                Object next = it4.next();
                if (((String) next).length() <= 0) {
                    z10 = false;
                }
                if (z10) {
                    arrayList5.add(next);
                }
            }
        }
        TokenViewModel tokenViewModel = this.f31661h;
        tokenViewModel.f31432U0.setValue(arrayList5);
        ArrayList arrayList6 = new ArrayList(C9325m.m17681z(arrayList5, 10));
        for (String str : arrayList5) {
            arrayList6.add(new C5817g.a.C10634a(str, tokenViewModel.m10379t2(str)));
        }
        arrayList.addAll(arrayList6);
        if ((interfaceC7379f instanceof C7374a) && (C5207g.m11106a(tokenViewState, TokenViewState.Expanded.f31717a) || (!arrayList.isEmpty()))) {
            arrayList.add(0, new C5817g.a.b());
        }
        return arrayList;
    }
}

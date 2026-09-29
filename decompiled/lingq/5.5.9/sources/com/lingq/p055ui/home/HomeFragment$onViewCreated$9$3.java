package com.lingq.p055ui.home;

import ae.C0062b;
import android.R;
import android.widget.ArrayAdapter;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$3", m19206f = "HomeFragment.kt", m19207l = {273}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22704f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$3$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34701 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22705e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22706f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34701(HomeFragment homeFragment, InterfaceC9968c<? super C34701> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22706f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34701 c34701 = new C34701(this.f22706f, interfaceC9968c);
            c34701.f22705e = obj;
            return c34701;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34701) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f22705e;
            if (list != null) {
                HomeFragment homeFragment = this.f22706f;
                homeFragment.f22657D0 = new ArrayAdapter<>(homeFragment.m3578a0(), R.layout.simple_list_item_single_choice);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(C4924a.m10439R(homeFragment.m3578a0(), ((UserDictionaryLocale) it.next()).f21721a));
                }
                C9326n.m17682B(arrayList, new HomeFragment.C3463d(new InterfaceC2056p<String, String, Integer>() { // from class: com.lingq.ui.home.HomeFragment$onViewCreated$9$3$1$1$1
                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Integer mo1337m0(String str, String str2) {
                        String str3 = str2;
                        C5207g.m11110e(str3, "t1");
                        return Integer.valueOf(str.compareTo(str3));
                    }
                }));
                ArrayAdapter<String> arrayAdapter = homeFragment.f22657D0;
                if (arrayAdapter == null) {
                    C5207g.m11117l("localesAdapter");
                    throw null;
                }
                arrayAdapter.addAll(arrayList);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$3(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22704f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$3(this.f22704f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22703e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22704f;
            HomeViewModel homeViewModelM9770s0 = homeFragment.m9770s0();
            C34701 c34701 = new C34701(homeFragment, null);
            this.f22703e = 1;
            if (C0062b.m369m0(homeViewModelM9770s0.f22742R, c34701, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}

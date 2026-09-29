package com.lingq.p055ui.home.playlist;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import ki.C6696b;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\b\u001a\u00020\u0007H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lki/c;", "", "lessons", "Lki/b;", "courses", "Lsl/e;", "loaded", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.playlist.PlaylistViewModel$_lessonsAll$1", m19206f = "PlaylistViewModel.kt", m19207l = {154}, m19208m = "invokeSuspend")
final class PlaylistViewModel$_lessonsAll$1 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super List<C6697c>>, List<? extends C6697c>, List<? extends C6696b>, C9072e, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25691e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f25692f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f25693g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f25694h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ PlaylistViewModel f25695i;

    /* JADX INFO: renamed from: com.lingq.ui.home.playlist.PlaylistViewModel$_lessonsAll$1$a */
    public static final class C3936a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m((Integer) t10, (Integer) t11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$_lessonsAll$1(PlaylistViewModel playlistViewModel, InterfaceC9968c<? super PlaylistViewModel$_lessonsAll$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f25695i = playlistViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super List<C6697c>> interfaceC7117d, List<? extends C6697c> list, List<? extends C6696b> list2, C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        PlaylistViewModel$_lessonsAll$1 playlistViewModel$_lessonsAll$1 = new PlaylistViewModel$_lessonsAll$1(this.f25695i, interfaceC9968c);
        playlistViewModel$_lessonsAll$1.f25692f = interfaceC7117d;
        playlistViewModel$_lessonsAll$1.f25693g = list;
        playlistViewModel$_lessonsAll$1.f25694h = list2;
        return playlistViewModel$_lessonsAll$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        Object next2;
        C6697c c6697c;
        Integer num;
        List list;
        C6696b c6696b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25691e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f25692f;
            List list2 = this.f25693g;
            List list3 = this.f25694h;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                Integer num2 = null;
                if (!it.hasNext()) {
                    break;
                }
                C6697c c6697c2 = (C6697c) it.next();
                if (c6697c2 != null) {
                    num2 = c6697c2.f37871p;
                }
                arrayList2.add(num2);
            }
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
            Iterator it2 = list3.iterator();
            while (true) {
                int i11 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                C6696b c6696b2 = (C6696b) it2.next();
                if (c6696b2 != null) {
                    i11 = c6696b2.f37855c;
                }
                C0009a.m30s(i11, arrayList3);
            }
            ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList3, arrayList2);
            TreeSet treeSet = new TreeSet(new C3936a());
            C6752c.m13450r0(arrayListM13438f0, treeSet);
            Iterator it3 = C6752c.m13421O(treeSet).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue();
                Iterator it4 = list3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                    c6696b = (C6696b) next;
                } while (!(c6696b != null && c6696b.f37855c == iIntValue));
                C6696b c6696b3 = (C6696b) next;
                if (c6696b3 != null && (list = (List) this.f25695i.f25600a0.get(new Integer(c6696b3.f37853a))) != null) {
                    arrayList.addAll(list);
                }
                Iterator it5 = list2.iterator();
                do {
                    if (!it5.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it5.next();
                    c6697c = (C6697c) next2;
                } while (!((c6697c == null || (num = c6697c.f37871p) == null || num.intValue() != iIntValue) ? false : true));
                C6697c c6697c3 = (C6697c) next2;
                if (c6697c3 != null) {
                    arrayList.add(c6697c3);
                }
            }
            this.f25692f = null;
            this.f25693g = null;
            this.f25691e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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

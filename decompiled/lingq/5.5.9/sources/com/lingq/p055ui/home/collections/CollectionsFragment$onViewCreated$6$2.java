package com.lingq.p055ui.home.collections;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.C0141b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$2", m19206f = "CollectionsFragment.kt", m19207l = {426}, m19208m = "invokeSuspend")
public final class CollectionsFragment$onViewCreated$6$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23174e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsFragment f23175f;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$2$1", m19206f = "CollectionsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35411 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23176e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsFragment f23177f;

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$2$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CollectionsFragment f23178a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f23179b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f23180c;

            public a(CollectionsFragment collectionsFragment, int i10, int i11) {
                this.f23178a = collectionsFragment;
                this.f23179b = i10;
                this.f23180c = i11;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
                CollectionsViewModel collectionsViewModelM9800p0 = this.f23178a.m9800p0();
                C7828f.m15570d(C8573r0.m16767w0(collectionsViewModelM9800p0), null, null, new CollectionsViewModel$buyLesson$1(collectionsViewModelM9800p0, this.f23180c, this.f23179b, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsFragment$onViewCreated$6$2$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f23181a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35411(CollectionsFragment collectionsFragment, InterfaceC9968c<? super C35411> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23177f = collectionsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35411 c35411 = new C35411(this.f23177f, interfaceC9968c);
            c35411.f23176e = obj;
            return c35411;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends Integer, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35411) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f23176e;
            int iIntValue = ((Number) triple.f38021a).intValue();
            int iIntValue2 = ((Number) triple.f38022b).intValue();
            int iIntValue3 = ((Number) triple.f38023c).intValue();
            CollectionsFragment collectionsFragment = this.f23177f;
            C9249b c9249b = new C9249b(collectionsFragment.m3578a0());
            c9249b.setTitle(collectionsFragment.m3600t(R.string.premium_lesson));
            Locale locale = Locale.getDefault();
            String strM3600t = collectionsFragment.m3600t(R.string.purchase_item_details);
            C5207g.m11110e(strM3600t, "getString(R.string.purchase_item_details)");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(collectionsFragment.m3600t(R.string.ui_yes), new a(collectionsFragment, iIntValue, iIntValue3));
            c9249b.m17610c(collectionsFragment.m3600t(R.string.ui_no), b.f23181a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsFragment$onViewCreated$6$2(CollectionsFragment collectionsFragment, InterfaceC9968c<? super CollectionsFragment$onViewCreated$6$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23175f = collectionsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsFragment$onViewCreated$6$2(this.f23175f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsFragment$onViewCreated$6$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23174e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CollectionsFragment.f23142F0;
            CollectionsFragment collectionsFragment = this.f23175f;
            CollectionsViewModel collectionsViewModelM9800p0 = collectionsFragment.m9800p0();
            C35411 c35411 = new C35411(collectionsFragment, null);
            this.f23174e = 1;
            if (C0062b.m369m0(collectionsViewModelM9800p0.f23254g0, c35411, this) == coroutineSingletons) {
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

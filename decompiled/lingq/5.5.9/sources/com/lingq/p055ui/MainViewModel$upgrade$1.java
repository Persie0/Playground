package com.lingq.p055ui;

import ae.C0062b;
import android.os.Bundle;
import androidx.activity.result.C0204c;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.Receipt;
import com.lingq.shared.network.requests.RequestPurchase;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import p155he.C6041e;
import p260m8.C7499b;
import p289o5.C7926f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1", m19206f = "MainViewModel.kt", m19207l = {296}, m19208m = "invokeSuspend")
final class MainViewModel$upgrade$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22352e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22353f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ RequestPurchase f22354g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Purchase f22355h;

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$upgrade$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/network/requests/RequestPurchase;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1$1", m19206f = "MainViewModel.kt", m19207l = {291, 291}, m19208m = "invokeSuspend")
    public static final class C34291 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends RequestPurchase>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22356e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f22357f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ MainViewModel f22358g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ RequestPurchase f22359h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34291(MainViewModel mainViewModel, RequestPurchase requestPurchase, InterfaceC9968c<? super C34291> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22358g = mainViewModel;
            this.f22359h = requestPurchase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34291 c34291 = new C34291(this.f22358g, this.f22359h, interfaceC9968c);
            c34291.f22357f = obj;
            return c34291;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends RequestPurchase>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34291) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22356e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f22357f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f22357f;
            InterfaceC2020m interfaceC2020m = this.f22358g.f22283d;
            this.f22357f = interfaceC7117d;
            this.f22356e = 1;
            obj = interfaceC2020m.mo6141j(this.f22359h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f22357f = null;
            this.f22356e = 2;
            if (interfaceC7117d.mo1339r(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$upgrade$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/network/requests/RequestPurchase;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1$2", m19206f = "MainViewModel.kt", m19207l = {293}, m19208m = "invokeSuspend")
    public static final class C34302 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends RequestPurchase>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22360e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Throwable f22361f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ MainViewModel f22362g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Purchase f22363h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34302(MainViewModel mainViewModel, Purchase purchase, InterfaceC9968c<? super C34302> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f22362g = mainViewModel;
            this.f22363h = purchase;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Resource<? extends RequestPurchase>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C34302 c34302 = new C34302(this.f22362g, this.f22363h, interfaceC9968c);
            c34302.f22361f = th2;
            return c34302.mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22360e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Throwable th2 = this.f22361f;
                this.f22360e = 1;
                if (MainViewModel.m9717l2(this.f22362g, this.f22363h, th2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$upgrade$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/network/requests/RequestPurchase;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1$3", m19206f = "MainViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34313 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends RequestPurchase>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ MainViewModel f22364e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34313(MainViewModel mainViewModel, InterfaceC9968c<? super C34313> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22364e = mainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C34313(this.f22364e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends RequestPurchase>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34313) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f22364e.f22286e0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$upgrade$1$4 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lcom/lingq/shared/network/requests/RequestPurchase;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1$4", m19206f = "MainViewModel.kt", m19207l = {312, 313, 316, 320}, m19208m = "invokeSuspend")
    public static final class C34324 extends SuspendLambda implements InterfaceC2056p<Resource<? extends RequestPurchase>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f22365e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f22366f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ MainViewModel f22367g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Purchase f22368h;

        /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$upgrade$1$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$upgrade$1$4$1", m19206f = "MainViewModel.kt", m19207l = {301, 309}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f22369e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ MainViewModel f22370f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Resource<RequestPurchase> f22371g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainViewModel mainViewModel, Resource<RequestPurchase> resource, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f22370f = mainViewModel;
                this.f22371g = resource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f22370f, this.f22371g, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:59:0x011b  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                double d10;
                String str;
                String str2;
                String str3;
                C7926f.d dVar;
                C7926f.c cVar;
                ArrayList arrayList;
                C7926f.b bVar;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f22369e;
                boolean z10 = true;
                MainViewModel mainViewModel = this.f22370f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7499b.m14977z0(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                    return C9072e.f47360a;
                }
                C7499b.m14977z0(obj);
                InterfaceC7116c<Profile> interfaceC7116cMo504j1 = mainViewModel.mo504j1();
                this.f22369e = 1;
                obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                C7796d c7796d = mainViewModel.f22293i;
                RequestPurchase requestPurchase = this.f22371g.f17863b;
                List list = (List) mainViewModel.f22275V.getValue();
                String str4 = ((Profile) obj).f17795o;
                String str5 = (String) mainViewModel.f22294i0.getValue();
                C5207g.m11111f(c7796d, "analytics");
                C5207g.m11111f(str4, "language");
                C5207g.m11111f(str5, "attemptedAction");
                if ((requestPurchase != null ? requestPurchase.f18153a : null) != null) {
                    if (list != null && !list.isEmpty()) {
                        z10 = false;
                    }
                    if (!z10) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C7926f c7926f = (C7926f) it.next();
                                String str6 = c7926f.f43192c;
                                Receipt receipt = requestPurchase.f18153a;
                                if (C5207g.m11106a(str6, receipt != null ? receipt.f18012c : null)) {
                                    ArrayList arrayList2 = c7926f.f43197h;
                                    if (arrayList2 != null && (dVar = (C7926f.d) C6752c.m13425S(arrayList2)) != null && (cVar = dVar.f43204b) != null && (arrayList = cVar.f43202a) != null && (bVar = (C7926f.b) C6752c.m13425S(arrayList)) != null) {
                                        d10 = bVar.f43200a / 1000000.0f;
                                        str = bVar.f43201b;
                                        C5207g.m11110e(str, "it.priceCurrencyCode");
                                        break;
                                    }
                                    break;
                                }
                            }
                            d10 = 0.0d;
                            str = "";
                            break;
                        }
                    }
                    d10 = 0.0d;
                    str = "";
                    break;
                    Bundle bundle = new Bundle();
                    bundle.putString("Upgrade client", "android");
                    bundle.putString("Upgrade date", new DateTime().toString());
                    bundle.putString("Upgrade language", str4);
                    bundle.putString("Attempted prior action", str5);
                    bundle.putString("Payment platform", "Google");
                    Receipt receipt2 = requestPurchase.f18153a;
                    if (receipt2 != null && (str2 = receipt2.f18012c) != null) {
                        bundle.putString("Product Id", str2);
                        if (C7076b.m14278X2(str2, "lqa_001", false)) {
                            str3 = "1-Month Premium";
                        } else if (C7076b.m14278X2(str2, "lqa_002", false)) {
                            str3 = "6-Month Premium";
                        } else if (C7076b.m14278X2(str2, "lqa_003", false)) {
                            str3 = "12-Month Premium";
                        } else {
                            str3 = "1-Month Premium";
                        }
                        bundle.putString("Upgrade tier", str3);
                    }
                    bundle.putString("Amount paid", String.valueOf(d10));
                    bundle.putString("Currency", str);
                    c7796d.m15505b(bundle, "upgrade_confirmation");
                    C6041e c6041eM12476a = C6041e.m12476a();
                    Receipt receipt3 = requestPurchase.f18153a;
                    c6041eM12476a.m12477b(new Exception(C0204c.m852k("Upgraded successfully ", receipt3 != null ? receipt3.f18010a : null)));
                }
                this.f22369e = 2;
                if (mainViewModel.mo503f1(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34324(MainViewModel mainViewModel, Purchase purchase, InterfaceC9968c<? super C34324> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22367g = mainViewModel;
            this.f22368h = purchase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34324 c34324 = new C34324(this.f22367g, this.f22368h, interfaceC9968c);
            c34324.f22366f = obj;
            return c34324;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends RequestPurchase> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34324) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f22365e;
            Purchase purchase = this.f22368h;
            MainViewModel mainViewModel = this.f22367g;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                } else {
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f22366f;
            mainViewModel.f22286e0.setValue(resource.f17862a);
            if (resource.f17862a == Resource.Status.SUCCESS) {
                if (!mainViewModel.f22291h.m15513f()) {
                    C7828f.m15570d(mainViewModel.f22298l, null, null, new AnonymousClass1(mainViewModel, resource, null), 3);
                }
                this.f22365e = 1;
                if (mainViewModel.f22282c0.mo16480k(purchase, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                boolean zM9438a = C3304a.m9438a(resource);
                Exception exc = resource.f17864c;
                if (zM9438a) {
                    if (exc != null) {
                        this.f22365e = 3;
                        if (MainViewModel.m9717l2(mainViewModel, purchase, exc, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (exc != null) {
                    this.f22365e = 4;
                    if (MainViewModel.m9717l2(mainViewModel, purchase, exc, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return C9072e.f47360a;
            AbstractChannel abstractChannel = mainViewModel.f22280a0;
            this.f22365e = 2;
            if (abstractChannel.mo16480k(purchase, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$upgrade$1(MainViewModel mainViewModel, RequestPurchase requestPurchase, Purchase purchase, InterfaceC9968c<? super MainViewModel$upgrade$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22353f = mainViewModel;
        this.f22354g = requestPurchase;
        this.f22355h = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$upgrade$1(this.f22353f, this.f22354g, this.f22355h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$upgrade$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22352e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            RequestPurchase requestPurchase = this.f22354g;
            MainViewModel mainViewModel = this.f22353f;
            C7136q c7136q = new C7136q(new C34291(mainViewModel, requestPurchase, null));
            Purchase purchase = this.f22355h;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C34313(mainViewModel, null), new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(c7136q, new C34302(mainViewModel, purchase, null)));
            C34324 c34324 = new C34324(mainViewModel, purchase, null);
            this.f22352e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c34324, this) == coroutineSingletons) {
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

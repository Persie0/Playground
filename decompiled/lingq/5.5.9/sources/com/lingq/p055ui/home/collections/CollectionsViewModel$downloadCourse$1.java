package com.lingq.p055ui.home.collections;

import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.shared.uimodel.library.Sort;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$downloadCourse$1", m19206f = "CollectionsViewModel.kt", m19207l = {619, 626, 629, 640, 641, 647}, m19208m = "invokeSuspend")
final class CollectionsViewModel$downloadCourse$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23312e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23313f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23314g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$downloadCourse$1(CollectionsViewModel collectionsViewModel, int i10, String str, InterfaceC9968c<? super CollectionsViewModel$downloadCourse$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23313f = collectionsViewModel;
        this.f23314g = i10;
        this.f23315h = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$downloadCourse$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$downloadCourse$1(this.f23313f, this.f23314g, this.f23315h, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077 A[Catch: Exception -> 0x00f1, TRY_ENTER, TryCatch #0 {Exception -> 0x00f1, blocks: (B:8:0x0022, B:9:0x0028, B:41:0x00d6, B:10:0x002f, B:35:0x00bd, B:37:0x00c5, B:23:0x0077, B:25:0x008d, B:30:0x00aa, B:31:0x00ad, B:28:0x0098), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x008d A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:8:0x0022, B:9:0x0028, B:41:0x00d6, B:10:0x002f, B:35:0x00bd, B:37:0x00c5, B:23:0x0077, B:25:0x008d, B:30:0x00aa, B:31:0x00ad, B:28:0x0098), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[Catch: Exception -> 0x00f1, TryCatch #0 {Exception -> 0x00f1, blocks: (B:8:0x0022, B:9:0x0028, B:41:0x00d6, B:10:0x002f, B:35:0x00bd, B:37:0x00c5, B:23:0x0077, B:25:0x008d, B:30:0x00aa, B:31:0x00ad, B:28:0x0098), top: B:52:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0 A[RETURN] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List list;
        String str = this.f23315h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23312e;
        int i11 = this.f23314g;
        CollectionsViewModel collectionsViewModel = this.f23313f;
        try {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(obj);
                    InterfaceC2014g interfaceC2014g = collectionsViewModel.f23251f;
                    String strMo498E1 = collectionsViewModel.mo498E1();
                    int i12 = this.f23314g;
                    String value = LibraryItemType.Collection.getValue();
                    this.f23312e = 1;
                    if (interfaceC2014g.mo6062h(strMo498E1, i12, false, value, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC2014g interfaceC2014g2 = collectionsViewModel.f23251f;
                    this.f23312e = 2;
                    obj = interfaceC2014g2.mo6058d(i11, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                    if (list.isEmpty()) {
                        InterfaceC2014g interfaceC2014g3 = collectionsViewModel.f23251f;
                        String strMo498E2 = collectionsViewModel.mo498E1();
                        int i13 = this.f23314g;
                        Sort sort = Sort.Position;
                        List<String> listM17252r = (!C5207g.m11106a(str, "private") || C5207g.m11106a(str, "shared")) ? EmptyList.f38032a : C9000b.m17252r("netflix", "youtube");
                        this.f23312e = 3;
                        obj = interfaceC2014g3.mo6071q(strMo498E2, i13, sort, listM17252r, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Number) obj).intValue() > 0) {
                            InterfaceC2014g interfaceC2014g4 = collectionsViewModel.f23251f;
                            this.f23312e = 4;
                            obj = interfaceC2014g4.mo6058d(i11, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.f23312e = 5;
                            if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, (List) obj) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        this.f23312e = 6;
                        if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, list) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 1:
                    C7499b.m14977z0(obj);
                    InterfaceC2014g interfaceC2014g5 = collectionsViewModel.f23251f;
                    this.f23312e = 2;
                    obj = interfaceC2014g5.mo6058d(i11, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                    if (list.isEmpty()) {
                        InterfaceC2014g interfaceC2014g6 = collectionsViewModel.f23251f;
                        String strMo498E3 = collectionsViewModel.mo498E1();
                        int i14 = this.f23314g;
                        Sort sort2 = Sort.Position;
                        if (C5207g.m11106a(str, "private")) {
                        }
                        this.f23312e = 3;
                        obj = interfaceC2014g6.mo6071q(strMo498E3, i14, sort2, listM17252r, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Number) obj).intValue() > 0) {
                            InterfaceC2014g interfaceC2014g7 = collectionsViewModel.f23251f;
                            this.f23312e = 4;
                            obj = interfaceC2014g7.mo6058d(i11, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.f23312e = 5;
                            if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, (List) obj) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        this.f23312e = 6;
                        if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, list) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 2:
                    C7499b.m14977z0(obj);
                    list = (List) obj;
                    if (list.isEmpty()) {
                        InterfaceC2014g interfaceC2014g8 = collectionsViewModel.f23251f;
                        String strMo498E4 = collectionsViewModel.mo498E1();
                        int i15 = this.f23314g;
                        Sort sort3 = Sort.Position;
                        if (C5207g.m11106a(str, "private")) {
                        }
                        this.f23312e = 3;
                        obj = interfaceC2014g8.mo6071q(strMo498E4, i15, sort3, listM17252r, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (((Number) obj).intValue() > 0) {
                            InterfaceC2014g interfaceC2014g9 = collectionsViewModel.f23251f;
                            this.f23312e = 4;
                            obj = interfaceC2014g9.mo6058d(i11, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            this.f23312e = 5;
                            if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, (List) obj) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        this.f23312e = 6;
                        if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, list) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 3:
                    C7499b.m14977z0(obj);
                    if (((Number) obj).intValue() > 0) {
                        InterfaceC2014g interfaceC2014g10 = collectionsViewModel.f23251f;
                        this.f23312e = 4;
                        obj = interfaceC2014g10.mo6058d(i11, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        this.f23312e = 5;
                        if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, (List) obj) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                case 4:
                    C7499b.m14977z0(obj);
                    this.f23312e = 5;
                    if (CollectionsViewModel.m9826l2(collectionsViewModel, i11, (List) obj) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return C9072e.f47360a;
                case 5:
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
        }
    }
}

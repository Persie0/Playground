package com.lingq.p055ui.home.library;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$networkUpdateShelves$1", m19206f = "LibraryViewModel.kt", m19207l = {374}, m19208m = "invokeSuspend")
final class LibraryViewModel$networkUpdateShelves$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24890f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$networkUpdateShelves$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$networkUpdateShelves$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24890f = libraryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$networkUpdateShelves$1(this.f24890f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$networkUpdateShelves$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v8, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Iterable] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ?? arrayList;
        LibraryViewModel libraryViewModel = this.f24890f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24889e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Map map = (Map) ((Map) libraryViewModel.f24774h0.getValue()).get(libraryViewModel.mo498E1());
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add((LearningLevel) ((Map.Entry) it.next()).getKey());
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                InterfaceC2014g interfaceC2014g = libraryViewModel.f24769f;
                String strMo498E1 = libraryViewModel.mo498E1();
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((LearningLevel) it2.next()).getServerName());
                }
                this.f24889e = 1;
                if (interfaceC2014g.mo6070p(strMo498E1, arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}

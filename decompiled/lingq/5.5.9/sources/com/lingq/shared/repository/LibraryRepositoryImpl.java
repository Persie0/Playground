package com.lingq.shared.repository;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.room.RoomDatabaseKt;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import ci.InterfaceC2014g;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryCounter;
import com.lingq.shared.network.requests.RequestQuery;
import com.lingq.shared.network.result.ResultLibraryCounter;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.lesson.LessonAudio;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.shared.uimodel.library.CollectionsFilterProvider;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.Resources;
import com.lingq.shared.uimodel.library.Sort;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p076di.InterfaceC5182d;
import p181ii.C6332a;
import p181ii.C6333b;
import p260m8.C7499b;
import p338qd.C8573r0;
import p367rh.C8802p;
import p385sf.C9000b;
import p460wh.InterfaceC9939g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryRepositoryImpl implements InterfaceC2014g {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f20063a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9939g f20064b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1454i2 f20065c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1495o1 f20066d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5182d f20067e;

    public LibraryRepositoryImpl(LingQDatabase lingQDatabase, InterfaceC9939g interfaceC9939g, AbstractC1454i2 abstractC1454i2, AbstractC1495o1 abstractC1495o1, InterfaceC5182d interfaceC5182d) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(interfaceC9939g, "libraryService");
        C5207g.m11111f(abstractC1454i2, "libraryDao");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        this.f20063a = lingQDatabase;
        this.f20064b = interfaceC9939g;
        this.f20065c = abstractC1454i2;
        this.f20066d = abstractC1495o1;
        this.f20067e = interfaceC5182d;
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: a */
    public final Object mo6055a(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c) {
        return this.f20065c.mo5080x0(i10, interfaceC9968c);
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<LessonInfo> mo6056b(int i10) {
        return C0062b.m273H0(this.f20065c.mo5075r0(i10));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c mo6057c(List list) {
        return C0062b.m273H0(this.f20065c.mo5063N0(list, LibraryItemType.Content.getValue()));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: d */
    public final Object mo6058d(int i10, InterfaceC9968c<? super List<LessonAudio>> interfaceC9968c) {
        return this.f20065c.mo5077t0(i10, LibraryItemType.Content.getValue(), interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: e */
    public final Object mo6059e(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LibraryRepositoryImpl$networkCourseCounters$1 libraryRepositoryImpl$networkCourseCounters$1;
        LibraryRepositoryImpl libraryRepositoryImpl;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$networkCourseCounters$1) {
            libraryRepositoryImpl$networkCourseCounters$1 = (LibraryRepositoryImpl$networkCourseCounters$1) interfaceC9968c;
            int i10 = libraryRepositoryImpl$networkCourseCounters$1.f20085g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$networkCourseCounters$1.f20085g = i10 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$networkCourseCounters$1 = new LibraryRepositoryImpl$networkCourseCounters$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$networkCourseCounters$1 = new LibraryRepositoryImpl$networkCourseCounters$1(this, interfaceC9968c);
        }
        Object objM18485g = libraryRepositoryImpl$networkCourseCounters$1.f20083e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = libraryRepositoryImpl$networkCourseCounters$1.f20085g;
        if (i11 != 0) {
            if (i11 == 1) {
                libraryRepositoryImpl = libraryRepositoryImpl$networkCourseCounters$1.f20082d;
                C7499b.m14977z0(objM18485g);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18485g);
            }
        }
        C7499b.m14977z0(objM18485g);
        libraryRepositoryImpl$networkCourseCounters$1.f20082d = this;
        libraryRepositoryImpl$networkCourseCounters$1.f20085g = 1;
        objM18485g = this.f20064b.m18485g(str, list, libraryRepositoryImpl$networkCourseCounters$1);
        if (objM18485g == coroutineSingletons) {
            return coroutineSingletons;
        }
        libraryRepositoryImpl = this;
        Map map = (Map) objM18485g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C8573r0.m16715b0((ResultLibraryCounter) entry.getValue(), ((Number) entry.getKey()).intValue(), LibraryItemType.Collection.getValue()));
        }
        AbstractC1454i2 abstractC1454i2 = libraryRepositoryImpl.f20065c;
        libraryRepositoryImpl$networkCourseCounters$1.f20082d = null;
        libraryRepositoryImpl$networkCourseCounters$1.f20085g = 2;
        return abstractC1454i2.mo5054E0(arrayList, libraryRepositoryImpl$networkCourseCounters$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00be  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ed A[LOOP:0: B:40:0x00e7->B:42:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: f */
    public final Object mo6060f(int i10, String str, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        LibraryRepositoryImpl$buyCourse$1 libraryRepositoryImpl$buyCourse$1;
        LibraryRepositoryImpl libraryRepositoryImpl;
        LibraryCounter libraryCounter;
        AbstractC1454i2 abstractC1454i2;
        ArrayList arrayList;
        Iterator it;
        AbstractC1495o1 abstractC1495o1;
        AbstractC1495o1 abstractC1495o2;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$buyCourse$1) {
            libraryRepositoryImpl$buyCourse$1 = (LibraryRepositoryImpl$buyCourse$1) interfaceC9968c;
            int i11 = libraryRepositoryImpl$buyCourse$1.f20073i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$buyCourse$1.f20073i = i11 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$buyCourse$1 = new LibraryRepositoryImpl$buyCourse$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$buyCourse$1 = new LibraryRepositoryImpl$buyCourse$1(this, interfaceC9968c);
        }
        Object objM9540v = libraryRepositoryImpl$buyCourse$1.f20071g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z10 = true;
        switch (libraryRepositoryImpl$buyCourse$1.f20073i) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(objM9540v);
                libraryRepositoryImpl$buyCourse$1.f20068d = this;
                libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                libraryRepositoryImpl$buyCourse$1.f20073i = 1;
                objM9540v = m9540v(i10, str, libraryRepositoryImpl$buyCourse$1);
                if (objM9540v == coroutineSingletons) {
                    return coroutineSingletons;
                }
                libraryRepositoryImpl = this;
                if (((Boolean) objM9540v).booleanValue()) {
                    AbstractC1454i2 abstractC1454i3 = libraryRepositoryImpl.f20065c;
                    String value = LibraryItemType.Collection.getValue();
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 2;
                    objM9540v = abstractC1454i3.mo5082z0(i10, value, libraryRepositoryImpl$buyCourse$1);
                    if (objM9540v == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    libraryCounter = (LibraryCounter) objM9540v;
                    if (libraryCounter != null) {
                        libraryCounter.f17206g = true;
                        libraryCounter.f17213n = true;
                        abstractC1454i2 = libraryRepositoryImpl.f20065c;
                        libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                        libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                        libraryRepositoryImpl$buyCourse$1.f20073i = 3;
                        if (abstractC1454i2.mo5066Q0(libraryCounter, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    AbstractC1454i2 abstractC1454i4 = libraryRepositoryImpl.f20065c;
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 4;
                    objM9540v = abstractC1454i4.mo5078u0(i10, LibraryItemType.Content.getValue(), libraryRepositoryImpl$buyCourse$1);
                    if (objM9540v == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Iterable iterable = (Iterable) objM9540v;
                    arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        C0009a.m30s(((Number) it.next()).intValue(), arrayList);
                    }
                    abstractC1495o1 = libraryRepositoryImpl.f20066d;
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20069e = arrayList;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 5;
                    if (abstractC1495o1.mo5142O0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    abstractC1495o2 = libraryRepositoryImpl.f20066d;
                    libraryRepositoryImpl$buyCourse$1.f20068d = null;
                    libraryRepositoryImpl$buyCourse$1.f20069e = null;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                    if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                i10 = libraryRepositoryImpl$buyCourse$1.f20070f;
                libraryRepositoryImpl = libraryRepositoryImpl$buyCourse$1.f20068d;
                C7499b.m14977z0(objM9540v);
                if (((Boolean) objM9540v).booleanValue()) {
                    AbstractC1454i2 abstractC1454i5 = libraryRepositoryImpl.f20065c;
                    String value2 = LibraryItemType.Collection.getValue();
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 2;
                    objM9540v = abstractC1454i5.mo5082z0(i10, value2, libraryRepositoryImpl$buyCourse$1);
                    if (objM9540v == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    libraryCounter = (LibraryCounter) objM9540v;
                    if (libraryCounter != null) {
                        libraryCounter.f17206g = true;
                        libraryCounter.f17213n = true;
                        abstractC1454i2 = libraryRepositoryImpl.f20065c;
                        libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                        libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                        libraryRepositoryImpl$buyCourse$1.f20073i = 3;
                        if (abstractC1454i2.mo5066Q0(libraryCounter, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    AbstractC1454i2 abstractC1454i6 = libraryRepositoryImpl.f20065c;
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 4;
                    objM9540v = abstractC1454i6.mo5078u0(i10, LibraryItemType.Content.getValue(), libraryRepositoryImpl$buyCourse$1);
                    if (objM9540v == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    Iterable iterable2 = (Iterable) objM9540v;
                    arrayList = new ArrayList(C9325m.m17681z(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        C0009a.m30s(((Number) it.next()).intValue(), arrayList);
                    }
                    abstractC1495o1 = libraryRepositoryImpl.f20066d;
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20069e = arrayList;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 5;
                    if (abstractC1495o1.mo5142O0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    abstractC1495o2 = libraryRepositoryImpl.f20066d;
                    libraryRepositoryImpl$buyCourse$1.f20068d = null;
                    libraryRepositoryImpl$buyCourse$1.f20069e = null;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                    if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 2:
                i10 = libraryRepositoryImpl$buyCourse$1.f20070f;
                libraryRepositoryImpl = libraryRepositoryImpl$buyCourse$1.f20068d;
                C7499b.m14977z0(objM9540v);
                libraryCounter = (LibraryCounter) objM9540v;
                if (libraryCounter != null) {
                    libraryCounter.f17206g = true;
                    libraryCounter.f17213n = true;
                    abstractC1454i2 = libraryRepositoryImpl.f20065c;
                    libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                    libraryRepositoryImpl$buyCourse$1.f20070f = i10;
                    libraryRepositoryImpl$buyCourse$1.f20073i = 3;
                    if (abstractC1454i2.mo5066Q0(libraryCounter, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                AbstractC1454i2 abstractC1454i7 = libraryRepositoryImpl.f20065c;
                libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                libraryRepositoryImpl$buyCourse$1.f20073i = 4;
                objM9540v = abstractC1454i7.mo5078u0(i10, LibraryItemType.Content.getValue(), libraryRepositoryImpl$buyCourse$1);
                if (objM9540v == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Iterable iterable3 = (Iterable) objM9540v;
                arrayList = new ArrayList(C9325m.m17681z(iterable3, 10));
                it = iterable3.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((Number) it.next()).intValue(), arrayList);
                }
                abstractC1495o1 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                libraryRepositoryImpl$buyCourse$1.f20069e = arrayList;
                libraryRepositoryImpl$buyCourse$1.f20073i = 5;
                if (abstractC1495o1.mo5142O0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                abstractC1495o2 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = null;
                libraryRepositoryImpl$buyCourse$1.f20069e = null;
                libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return Boolean.valueOf(z10);
            case 3:
                i10 = libraryRepositoryImpl$buyCourse$1.f20070f;
                libraryRepositoryImpl = libraryRepositoryImpl$buyCourse$1.f20068d;
                C7499b.m14977z0(objM9540v);
                AbstractC1454i2 abstractC1454i8 = libraryRepositoryImpl.f20065c;
                libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                libraryRepositoryImpl$buyCourse$1.f20073i = 4;
                objM9540v = abstractC1454i8.mo5078u0(i10, LibraryItemType.Content.getValue(), libraryRepositoryImpl$buyCourse$1);
                if (objM9540v == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Iterable iterable4 = (Iterable) objM9540v;
                arrayList = new ArrayList(C9325m.m17681z(iterable4, 10));
                it = iterable4.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((Number) it.next()).intValue(), arrayList);
                }
                abstractC1495o1 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                libraryRepositoryImpl$buyCourse$1.f20069e = arrayList;
                libraryRepositoryImpl$buyCourse$1.f20073i = 5;
                if (abstractC1495o1.mo5142O0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                abstractC1495o2 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = null;
                libraryRepositoryImpl$buyCourse$1.f20069e = null;
                libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return Boolean.valueOf(z10);
            case 4:
                LibraryRepositoryImpl libraryRepositoryImpl2 = libraryRepositoryImpl$buyCourse$1.f20068d;
                C7499b.m14977z0(objM9540v);
                libraryRepositoryImpl = libraryRepositoryImpl2;
                Iterable iterable5 = (Iterable) objM9540v;
                arrayList = new ArrayList(C9325m.m17681z(iterable5, 10));
                it = iterable5.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((Number) it.next()).intValue(), arrayList);
                }
                abstractC1495o1 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = libraryRepositoryImpl;
                libraryRepositoryImpl$buyCourse$1.f20069e = arrayList;
                libraryRepositoryImpl$buyCourse$1.f20073i = 5;
                if (abstractC1495o1.mo5142O0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                abstractC1495o2 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = null;
                libraryRepositoryImpl$buyCourse$1.f20069e = null;
                libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return Boolean.valueOf(z10);
            case 5:
                arrayList = libraryRepositoryImpl$buyCourse$1.f20069e;
                libraryRepositoryImpl = libraryRepositoryImpl$buyCourse$1.f20068d;
                C7499b.m14977z0(objM9540v);
                abstractC1495o2 = libraryRepositoryImpl.f20066d;
                libraryRepositoryImpl$buyCourse$1.f20068d = null;
                libraryRepositoryImpl$buyCourse$1.f20069e = null;
                libraryRepositoryImpl$buyCourse$1.f20073i = 6;
                if (abstractC1495o2.mo5144Q0(arrayList, libraryRepositoryImpl$buyCourse$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return Boolean.valueOf(z10);
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7499b.m14977z0(objM9540v);
                return Boolean.valueOf(z10);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ad -> B:29:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: g */
    public final java.lang.Object mo6061g(java.lang.String r18, java.util.List<java.lang.Integer> r19, p464wl.InterfaceC9968c<? super sl.C9072e> r20) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.LibraryRepositoryImpl.mo6061g(java.lang.String, java.util.List, wl.c):java.lang.Object");
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: h */
    public final Object mo6062h(String str, int i10, boolean z10, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        AbstractC1454i2 abstractC1454i2 = this.f20065c;
        if (z10) {
            Object objMo5067R0 = abstractC1454i2.mo5067R0(i10, interfaceC9968c);
            return objMo5067R0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5067R0 : C9072e.f47360a;
        }
        Object objMo5055F0 = abstractC1454i2.mo5055F0(new C8802p(i10, str, str2, z10), interfaceC9968c);
        return objMo5055F0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5055F0 : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c mo6063i(int i10) {
        final C7136q c7136qMo5059J0 = this.f20065c.mo5059J0(LibraryItemType.Content.getValue(), i10);
        return C0062b.m273H0(new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.repository.LibraryRepositoryImpl$isCourseLessonsAddedToContinueStudying$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.repository.LibraryRepositoryImpl$isCourseLessonsAddedToContinueStudying$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20075a;

                /* JADX INFO: renamed from: com.lingq.shared.repository.LibraryRepositoryImpl$isCourseLessonsAddedToContinueStudying$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl$isCourseLessonsAddedToContinueStudying$$inlined$map$1$2", m19206f = "LibraryRepository.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20076d;

                    /* JADX INFO: renamed from: e */
                    public int f20077e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20076d = obj;
                        this.f20077e |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.mo1339r(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC7117d interfaceC7117d) {
                    this.f20075a = interfaceC7117d;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20077e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20077e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20076d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20077e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean boolValueOf = Boolean.valueOf(((Number) obj).intValue() > 0);
                        anonymousClass1.f20077e = 1;
                        if (this.f20075a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = c7136qMo5059J0.mo9539a(new AnonymousClass2(interfaceC7117d), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02dc A[LOOP:1: B:100:0x02d6->B:102:0x02dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x030c  */
    /* JADX WARN: Code duplicated, block: B:117:0x036e  */
    /* JADX WARN: Code duplicated, block: B:121:0x037d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0388  */
    /* JADX WARN: Code duplicated, block: B:125:0x038a  */
    /* JADX WARN: Code duplicated, block: B:127:0x038d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0390  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:132:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:136:0x0402  */
    /* JADX WARN: Code duplicated, block: B:138:0x0430 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x0431  */
    /* JADX WARN: Code duplicated, block: B:143:0x0437  */
    /* JADX WARN: Code duplicated, block: B:144:0x043c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    /* JADX WARN: Code duplicated, block: B:36:0x0181  */
    /* JADX WARN: Code duplicated, block: B:39:0x0192  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:56:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x0221  */
    /* JADX WARN: Code duplicated, block: B:64:0x0224  */
    /* JADX WARN: Code duplicated, block: B:67:0x022f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0232  */
    /* JADX WARN: Code duplicated, block: B:70:0x0237  */
    /* JADX WARN: Code duplicated, block: B:71:0x023a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0247  */
    /* JADX WARN: Code duplicated, block: B:79:0x0253 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:82:0x025b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0260  */
    /* JADX WARN: Code duplicated, block: B:86:0x026a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x0279  */
    /* JADX WARN: Code duplicated, block: B:93:0x0290 A[LOOP:3: B:91:0x028a->B:93:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x02dc, please report this as an issue */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: j */
    public final Object mo6064j(String str, String str2, String str3, boolean z10, String str4, String str5, String str6, int i10, InterfaceC9968c<? super Integer> interfaceC9968c) throws Exception {
        LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$1;
        String str7;
        String str8;
        LibraryRepositoryImpl libraryRepositoryImpl;
        LibraryRepositoryImpl libraryRepositoryImpl2;
        String str9;
        LibraryRepositoryImpl libraryRepositoryImpl3;
        String str10;
        int i11;
        Results results;
        String str11;
        CoroutineSingletons coroutineSingletons;
        String str12;
        LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$2;
        int i12;
        LibrarySearchQuery librarySearchQuery;
        LinkedHashSet linkedHashSet;
        Resources resources;
        Map<Resources, Boolean> map;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        String str13;
        Resources resources5;
        Resources resources6;
        Boolean bool;
        String str14;
        Boolean bool2;
        LinkedHashSet linkedHashSet2;
        int i13;
        ContentType contentType;
        int i14;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        CollectionsFilterProvider collectionsFilterProvider;
        Integer num;
        ArrayList arrayList;
        Iterator<T> it;
        List listM17251q;
        CollectionsFilterUser collectionsFilterUser;
        Integer num2;
        ArrayList arrayList2;
        int i15;
        String value;
        String str15;
        boolean z11;
        String str16;
        LibraryRepositoryImpl libraryRepositoryImpl4;
        Object objM18483e;
        String str17;
        String str18;
        String strM15497a;
        List<? extends ResultType> list;
        LingQDatabase lingQDatabase;
        LibraryRepositoryImpl$updateLibraryItems$2$1 libraryRepositoryImpl$updateLibraryItems$2$1;
        Results results2;
        List<? extends ResultType> list2;
        int size;
        String str19 = str;
        String str20 = str2;
        String str21 = str3;
        int i16 = i10;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$updateLibraryItems$1) {
            libraryRepositoryImpl$updateLibraryItems$1 = (LibraryRepositoryImpl$updateLibraryItems$1) interfaceC9968c;
            int i17 = libraryRepositoryImpl$updateLibraryItems$1.f20107H;
            if ((i17 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updateLibraryItems$1.f20107H = i17 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updateLibraryItems$1 = new LibraryRepositoryImpl$updateLibraryItems$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$updateLibraryItems$1 = new LibraryRepositoryImpl$updateLibraryItems$1(this, interfaceC9968c);
        }
        Object objM14360a = libraryRepositoryImpl$updateLibraryItems$1.f20115k;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = libraryRepositoryImpl$updateLibraryItems$1.f20107H;
        if (i18 == 0) {
            C7499b.m14977z0(objM14360a);
            if (z10) {
                String strM15254T2 = C7661i.m15254T2(str4, "page_size=6", "page_size=18");
                libraryRepositoryImpl$updateLibraryItems$1.f20108d = this;
                libraryRepositoryImpl$updateLibraryItems$1.f20109e = str19;
                libraryRepositoryImpl$updateLibraryItems$1.f20110f = str20;
                libraryRepositoryImpl$updateLibraryItems$1.f20111g = str21;
                libraryRepositoryImpl$updateLibraryItems$1.f20114j = i16;
                libraryRepositoryImpl$updateLibraryItems$1.f20107H = 1;
                objM14360a = this.f20064b.m18482d(strM15254T2, libraryRepositoryImpl$updateLibraryItems$1);
                if (objM14360a == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                libraryRepositoryImpl2 = this;
                str9 = str20;
                libraryRepositoryImpl3 = libraryRepositoryImpl2;
                str10 = null;
                i11 = 0;
                results = (Results) objM14360a;
                str11 = str19;
                coroutineSingletons = coroutineSingletons2;
                int i19 = i16;
                str12 = str21;
                libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$1;
                i12 = i19;
                list = results.f19136d;
                if (list != 0) {
                    String strM15498b = C7793a.m15498b(str11, str9);
                    lingQDatabase = libraryRepositoryImpl3.f20063a;
                    libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b, str12, str11, null);
                    libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                    libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                    if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    results2 = results;
                }
                list2 = results.f19136d;
                if (list2 != 0) {
                    size = list2.size();
                } else {
                    size = i11;
                }
                return new Integer(size);
            }
            InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = this.f20067e.mo9688l();
            libraryRepositoryImpl$updateLibraryItems$1.f20108d = this;
            libraryRepositoryImpl$updateLibraryItems$1.f20109e = str19;
            libraryRepositoryImpl$updateLibraryItems$1.f20110f = str20;
            libraryRepositoryImpl$updateLibraryItems$1.f20111g = str21;
            str7 = str5;
            libraryRepositoryImpl$updateLibraryItems$1.f20112h = str7;
            str8 = str6;
            libraryRepositoryImpl$updateLibraryItems$1.f20113i = str8;
            libraryRepositoryImpl$updateLibraryItems$1.f20114j = i16;
            libraryRepositoryImpl$updateLibraryItems$1.f20107H = 2;
            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, libraryRepositoryImpl$updateLibraryItems$1);
            if (objM14360a == coroutineSingletons2) {
                return coroutineSingletons2;
            }
            libraryRepositoryImpl = this;
            librarySearchQuery = (LibrarySearchQuery) ((Map) objM14360a).get(str8);
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
            }
            int i20 = librarySearchQuery.f22026c;
            String value2 = librarySearchQuery.f22027d.getValue();
            linkedHashSet = new LinkedHashSet();
            resources = Resources.ResourceAttachments;
            Boolean bool6 = Boolean.FALSE;
            map = librarySearchQuery.f22024a;
            map.put(resources, bool6);
            resources2 = Resources.ResourceExercises;
            map.put(resources2, bool6);
            resources3 = Resources.ResourceNotes;
            map.put(resources3, bool6);
            int i21 = i16;
            resources4 = Resources.ResourceScript;
            map.put(resources4, bool6);
            str13 = str19;
            resources5 = Resources.ResourceTranslations;
            map.put(resources5, bool6);
            LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$3 = libraryRepositoryImpl$updateLibraryItems$1;
            resources6 = Resources.ResourceVideos;
            map.put(resources6, bool6);
            bool = map.get(resources);
            str14 = str21;
            bool2 = Boolean.TRUE;
            if (C5207g.m11106a(bool, bool2)) {
                linkedHashSet.add(resources.getValue());
            }
            if (C5207g.m11106a(map.get(resources2), bool2)) {
                linkedHashSet.add(resources.getValue());
            }
            if (C5207g.m11106a(map.get(resources3), bool2)) {
                linkedHashSet.add(resources3.getValue());
            }
            if (C5207g.m11106a(map.get(resources5), bool2)) {
                linkedHashSet.add(resources5.getValue());
            }
            if (C5207g.m11106a(map.get(resources6), bool2)) {
                linkedHashSet.add(resources6.getValue());
            }
            if (C5207g.m11106a(map.get(resources4), bool2)) {
                linkedHashSet.add(resources4.getValue());
            }
            linkedHashSet2 = new LinkedHashSet();
            for (LearningLevel learningLevel : LearningLevel.values()) {
                if (C5207g.m11106a(librarySearchQuery.f22025b.get(learningLevel), Boolean.TRUE)) {
                    linkedHashSet2.add(Integer.valueOf(learningLevel.ordinal() + 1));
                }
            }
            if (linkedHashSet2.size() == LearningLevel.values().length) {
                linkedHashSet2.clear();
            }
            ContentType.Companion companion = ContentType.INSTANCE;
            contentType = librarySearchQuery.f22032i;
            companion.getClass();
            if (contentType == null) {
                i14 = -1;
            } else {
                i14 = ContentType.Companion.a.f21600a[contentType.ordinal()];
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    bool4 = null;
                } else {
                    bool3 = Boolean.FALSE;
                }
                if (C7076b.m14278X2(str8, "_my_imports_", false)) {
                    bool5 = Boolean.TRUE;
                }
                Boolean bool7 = bool5;
                collectionsFilterProvider = librarySearchQuery.f22033j;
                if (collectionsFilterProvider != null) {
                    num = collectionsFilterProvider.f21926a;
                } else {
                    num = null;
                }
                List<String> list3 = librarySearchQuery.f22031h;
                if (C7793a.m15497a(str20) != null) {
                    strM15497a = C7793a.m15497a(str20);
                    if (strM15497a == null) {
                        strM15497a = "";
                    }
                    listM17251q = C9000b.m17251q(strM15497a);
                } else {
                    List<Accent> list4 = librarySearchQuery.f22035l;
                    arrayList = new ArrayList(C9325m.m17681z(list4, 10));
                    it = list4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Accent) it.next()).getValue());
                    }
                    listM17251q = arrayList;
                }
                collectionsFilterUser = librarySearchQuery.f22034k;
                if (collectionsFilterUser != null) {
                    num2 = new Integer(collectionsFilterUser.f21932a);
                } else {
                    num2 = null;
                }
                RequestQuery requestQuery = new RequestQuery(i20, value2, null, linkedHashSet, linkedHashSet2, bool4, bool7, num, list3, listM17251q, num2, 4, null);
                InterfaceC9939g interfaceC9939g = libraryRepositoryImpl.f20064b;
                LibraryContentType[] libraryContentTypeArrValues = LibraryContentType.values();
                arrayList2 = new ArrayList(libraryContentTypeArrValues.length);
                for (LibraryContentType libraryContentType : libraryContentTypeArrValues) {
                    arrayList2.add("_type=" + libraryContentType.getValue() + "_");
                }
                HashSet<String> hashSetM13451s0 = C6752c.m13451s0(arrayList2);
                String value3 = LibraryItemType.Content.getValue();
                value = value3;
                for (String str22 : hashSetM13451s0) {
                    if (C7076b.m14278X2(str20, str22, false)) {
                        if (C5207g.m11106a(str22, "_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                            value = LibraryItemType.Content.getValue();
                        } else {
                            String value4 = LibraryContentType.Courses.getValue();
                            StringBuilder sb2 = new StringBuilder("_type=");
                            sb2.append(value4);
                            sb2.append("_");
                            if (C5207g.m11106a(str22, sb2.toString())) {
                            }
                        }
                    }
                }
                String str23 = requestQuery.f18165b;
                if (C5207g.m11106a(str7, LibraryShelfType.Search.getValue())) {
                    str15 = null;
                } else {
                    str15 = null;
                }
                Set<Integer> set = requestQuery.f18168e;
                Set<String> set2 = requestQuery.f18167d;
                if (str14.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    str16 = null;
                } else {
                    str16 = str14;
                }
                Boolean bool8 = requestQuery.f18169f;
                Boolean bool9 = requestQuery.f18170g;
                Integer num3 = requestQuery.f18171h;
                List<String> list5 = requestQuery.f18172i;
                List<String> list6 = requestQuery.f18173j;
                Integer num4 = requestQuery.f18174k;
                Integer num5 = new Integer(20);
                libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$3;
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = libraryRepositoryImpl;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str13;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str20;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str14;
                libraryRepositoryImpl$updateLibraryItems$2.f20112h = null;
                libraryRepositoryImpl$updateLibraryItems$2.f20113i = null;
                libraryRepositoryImpl$updateLibraryItems$2.f20114j = i21;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 3;
                i12 = i21;
                str10 = null;
                i11 = 0;
                libraryRepositoryImpl4 = libraryRepositoryImpl;
                coroutineSingletons = coroutineSingletons2;
                objM18483e = interfaceC9939g.m18483e(str13, num5, str23, value, set, str15, set2, str16, bool8, bool9, num3, list5, list6, num4, i12, C9000b.m17252r("netflix", "youtube"), libraryRepositoryImpl$updateLibraryItems$2);
                if (objM18483e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str17 = str20;
                str18 = str14;
                str11 = str13;
                results = (Results) objM18483e;
                str9 = str17;
                str12 = str18;
                libraryRepositoryImpl3 = libraryRepositoryImpl4;
                list = results.f19136d;
                if (list != 0) {
                    String strM15498b2 = C7793a.m15498b(str11, str9);
                    lingQDatabase = libraryRepositoryImpl3.f20063a;
                    libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b2, str12, str11, null);
                    libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                    libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                    if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    results2 = results;
                }
                list2 = results.f19136d;
                if (list2 != 0) {
                    size = list2.size();
                } else {
                    size = i11;
                }
                return new Integer(size);
            }
            bool3 = Boolean.TRUE;
            bool4 = bool3;
            if (C7076b.m14278X2(str8, "_my_imports_", false)) {
                bool5 = Boolean.TRUE;
            }
            Boolean bool10 = bool5;
            collectionsFilterProvider = librarySearchQuery.f22033j;
            if (collectionsFilterProvider != null) {
                num = collectionsFilterProvider.f21926a;
            } else {
                num = null;
            }
            List<String> list7 = librarySearchQuery.f22031h;
            if (C7793a.m15497a(str20) != null) {
                strM15497a = C7793a.m15497a(str20);
                if (strM15497a == null) {
                    strM15497a = "";
                }
                listM17251q = C9000b.m17251q(strM15497a);
            } else {
                List<Accent> list8 = librarySearchQuery.f22035l;
                arrayList = new ArrayList(C9325m.m17681z(list8, 10));
                it = list8.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Accent) it.next()).getValue());
                }
                listM17251q = arrayList;
            }
            collectionsFilterUser = librarySearchQuery.f22034k;
            if (collectionsFilterUser != null) {
                num2 = new Integer(collectionsFilterUser.f21932a);
            } else {
                num2 = null;
            }
            RequestQuery requestQuery2 = new RequestQuery(i20, value2, null, linkedHashSet, linkedHashSet2, bool4, bool10, num, list7, listM17251q, num2, 4, null);
            InterfaceC9939g interfaceC9939g2 = libraryRepositoryImpl.f20064b;
            LibraryContentType[] libraryContentTypeArrValues2 = LibraryContentType.values();
            arrayList2 = new ArrayList(libraryContentTypeArrValues2.length);
            while (i15 < r6) {
                arrayList2.add("_type=" + libraryContentType.getValue() + "_");
            }
            HashSet<String> hashSetM13451s1 = C6752c.m13451s0(arrayList2);
            String value5 = LibraryItemType.Content.getValue();
            value = value5;
            while (r1.hasNext()) {
                if (C7076b.m14278X2(str20, str22, false)) {
                    if (C5207g.m11106a(str22, "_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                        value = LibraryItemType.Content.getValue();
                    } else {
                        String value6 = LibraryContentType.Courses.getValue();
                        StringBuilder sb3 = new StringBuilder("_type=");
                        sb3.append(value6);
                        sb3.append("_");
                        if (C5207g.m11106a(str22, sb3.toString())) {
                        }
                    }
                }
            }
            String str24 = requestQuery2.f18165b;
            if (C5207g.m11106a(str7, LibraryShelfType.Search.getValue())) {
                str15 = null;
            } else {
                str15 = null;
            }
            Set<Integer> set3 = requestQuery2.f18168e;
            Set<String> set4 = requestQuery2.f18167d;
            if (str14.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str16 = null;
            } else {
                str16 = str14;
            }
            Boolean bool11 = requestQuery2.f18169f;
            Boolean bool12 = requestQuery2.f18170g;
            Integer num6 = requestQuery2.f18171h;
            List<String> list9 = requestQuery2.f18172i;
            List<String> list10 = requestQuery2.f18173j;
            Integer num7 = requestQuery2.f18174k;
            Integer num8 = new Integer(20);
            libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$3;
            libraryRepositoryImpl$updateLibraryItems$2.f20108d = libraryRepositoryImpl;
            libraryRepositoryImpl$updateLibraryItems$2.f20109e = str13;
            libraryRepositoryImpl$updateLibraryItems$2.f20110f = str20;
            libraryRepositoryImpl$updateLibraryItems$2.f20111g = str14;
            libraryRepositoryImpl$updateLibraryItems$2.f20112h = null;
            libraryRepositoryImpl$updateLibraryItems$2.f20113i = null;
            libraryRepositoryImpl$updateLibraryItems$2.f20114j = i21;
            libraryRepositoryImpl$updateLibraryItems$2.f20107H = 3;
            i12 = i21;
            str10 = null;
            i11 = 0;
            libraryRepositoryImpl4 = libraryRepositoryImpl;
            coroutineSingletons = coroutineSingletons2;
            objM18483e = interfaceC9939g2.m18483e(str13, num8, str24, value, set3, str15, set4, str16, bool11, bool12, num6, list9, list10, num7, i12, C9000b.m17252r("netflix", "youtube"), libraryRepositoryImpl$updateLibraryItems$2);
            if (objM18483e == coroutineSingletons) {
                return coroutineSingletons;
            }
            str17 = str20;
            str18 = str14;
            str11 = str13;
            results = (Results) objM18483e;
            str9 = str17;
            str12 = str18;
            libraryRepositoryImpl3 = libraryRepositoryImpl4;
            list = results.f19136d;
            if (list != 0) {
                String strM15498b3 = C7793a.m15498b(str11, str9);
                lingQDatabase = libraryRepositoryImpl3.f20063a;
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b3, str12, str11, null);
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                results2 = results;
            }
            list2 = results.f19136d;
            if (list2 != 0) {
                size = list2.size();
            } else {
                size = i11;
            }
            return new Integer(size);
        }
        if (i18 == 1) {
            int i22 = libraryRepositoryImpl$updateLibraryItems$1.f20114j;
            String str25 = libraryRepositoryImpl$updateLibraryItems$1.f20111g;
            String str26 = libraryRepositoryImpl$updateLibraryItems$1.f20110f;
            String str27 = libraryRepositoryImpl$updateLibraryItems$1.f20109e;
            libraryRepositoryImpl2 = (LibraryRepositoryImpl) libraryRepositoryImpl$updateLibraryItems$1.f20108d;
            C7499b.m14977z0(objM14360a);
            i16 = i22;
            str19 = str27;
            str21 = str25;
            str20 = str26;
            str9 = str20;
            libraryRepositoryImpl3 = libraryRepositoryImpl2;
            str10 = null;
            i11 = 0;
            results = (Results) objM14360a;
            str11 = str19;
            coroutineSingletons = coroutineSingletons2;
            int i110 = i16;
            str12 = str21;
            libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$1;
            i12 = i110;
            list = results.f19136d;
            if (list != 0) {
                String strM15498b4 = C7793a.m15498b(str11, str9);
                lingQDatabase = libraryRepositoryImpl3.f20063a;
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b4, str12, str11, null);
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                results2 = results;
            }
            list2 = results.f19136d;
            if (list2 != 0) {
                size = list2.size();
            } else {
                size = i11;
            }
            return new Integer(size);
        }
        if (i18 == 2) {
            int i23 = libraryRepositoryImpl$updateLibraryItems$1.f20114j;
            String str28 = libraryRepositoryImpl$updateLibraryItems$1.f20113i;
            String str29 = libraryRepositoryImpl$updateLibraryItems$1.f20112h;
            String str30 = libraryRepositoryImpl$updateLibraryItems$1.f20111g;
            String str31 = libraryRepositoryImpl$updateLibraryItems$1.f20110f;
            String str32 = libraryRepositoryImpl$updateLibraryItems$1.f20109e;
            libraryRepositoryImpl = (LibraryRepositoryImpl) libraryRepositoryImpl$updateLibraryItems$1.f20108d;
            C7499b.m14977z0(objM14360a);
            i16 = i23;
            str19 = str32;
            str8 = str28;
            str20 = str31;
            str7 = str29;
            str21 = str30;
            librarySearchQuery = (LibrarySearchQuery) ((Map) objM14360a).get(str8);
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
            }
            int i24 = librarySearchQuery.f22026c;
            String value7 = librarySearchQuery.f22027d.getValue();
            linkedHashSet = new LinkedHashSet();
            resources = Resources.ResourceAttachments;
            Boolean bool13 = Boolean.FALSE;
            map = librarySearchQuery.f22024a;
            map.put(resources, bool13);
            resources2 = Resources.ResourceExercises;
            map.put(resources2, bool13);
            resources3 = Resources.ResourceNotes;
            map.put(resources3, bool13);
            int i25 = i16;
            resources4 = Resources.ResourceScript;
            map.put(resources4, bool13);
            str13 = str19;
            resources5 = Resources.ResourceTranslations;
            map.put(resources5, bool13);
            LibraryRepositoryImpl$updateLibraryItems$1 libraryRepositoryImpl$updateLibraryItems$4 = libraryRepositoryImpl$updateLibraryItems$1;
            resources6 = Resources.ResourceVideos;
            map.put(resources6, bool13);
            bool = map.get(resources);
            str14 = str21;
            bool2 = Boolean.TRUE;
            if (C5207g.m11106a(bool, bool2)) {
                linkedHashSet.add(resources.getValue());
            }
            if (C5207g.m11106a(map.get(resources2), bool2)) {
                linkedHashSet.add(resources.getValue());
            }
            if (C5207g.m11106a(map.get(resources3), bool2)) {
                linkedHashSet.add(resources3.getValue());
            }
            if (C5207g.m11106a(map.get(resources5), bool2)) {
                linkedHashSet.add(resources5.getValue());
            }
            if (C5207g.m11106a(map.get(resources6), bool2)) {
                linkedHashSet.add(resources6.getValue());
            }
            if (C5207g.m11106a(map.get(resources4), bool2)) {
                linkedHashSet.add(resources4.getValue());
            }
            linkedHashSet2 = new LinkedHashSet();
            while (i13 < r3) {
                if (C5207g.m11106a(librarySearchQuery.f22025b.get(learningLevel), Boolean.TRUE)) {
                    linkedHashSet2.add(Integer.valueOf(learningLevel.ordinal() + 1));
                }
            }
            if (linkedHashSet2.size() == LearningLevel.values().length) {
                linkedHashSet2.clear();
            }
            ContentType.Companion companion2 = ContentType.INSTANCE;
            contentType = librarySearchQuery.f22032i;
            companion2.getClass();
            if (contentType == null) {
                i14 = -1;
            } else {
                i14 = ContentType.Companion.a.f21600a[contentType.ordinal()];
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    bool4 = null;
                } else {
                    bool3 = Boolean.FALSE;
                }
                bool5 = (C7076b.m14278X2(str8, "_my_imports_", false) || librarySearchQuery.f22032i == ContentType.MyImports) ? Boolean.TRUE : null;
                Boolean bool14 = bool5;
                collectionsFilterProvider = librarySearchQuery.f22033j;
                if (collectionsFilterProvider != null) {
                    num = collectionsFilterProvider.f21926a;
                } else {
                    num = null;
                }
                List<String> list11 = librarySearchQuery.f22031h;
                if (C7793a.m15497a(str20) != null) {
                    strM15497a = C7793a.m15497a(str20);
                    if (strM15497a == null) {
                        strM15497a = "";
                    }
                    listM17251q = C9000b.m17251q(strM15497a);
                } else {
                    List<Accent> list12 = librarySearchQuery.f22035l;
                    arrayList = new ArrayList(C9325m.m17681z(list12, 10));
                    it = list12.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Accent) it.next()).getValue());
                    }
                    listM17251q = arrayList;
                }
                collectionsFilterUser = librarySearchQuery.f22034k;
                if (collectionsFilterUser != null) {
                    num2 = new Integer(collectionsFilterUser.f21932a);
                } else {
                    num2 = null;
                }
                RequestQuery requestQuery3 = new RequestQuery(i24, value7, null, linkedHashSet, linkedHashSet2, bool4, bool14, num, list11, listM17251q, num2, 4, null);
                InterfaceC9939g interfaceC9939g3 = libraryRepositoryImpl.f20064b;
                LibraryContentType[] libraryContentTypeArrValues3 = LibraryContentType.values();
                arrayList2 = new ArrayList(libraryContentTypeArrValues3.length);
                while (i15 < r6) {
                    arrayList2.add("_type=" + libraryContentType.getValue() + "_");
                }
                HashSet<String> hashSetM13451s2 = C6752c.m13451s0(arrayList2);
                String value8 = LibraryItemType.Content.getValue();
                value = value8;
                while (r1.hasNext()) {
                    if (C7076b.m14278X2(str20, str22, false)) {
                        if (C5207g.m11106a(str22, "_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                            value = LibraryItemType.Content.getValue();
                        } else {
                            String value9 = LibraryContentType.Courses.getValue();
                            StringBuilder sb4 = new StringBuilder("_type=");
                            sb4.append(value9);
                            sb4.append("_");
                            value = C5207g.m11106a(str22, sb4.toString()) ? LibraryItemType.Collection.getValue() : null;
                        }
                    }
                }
                String str210 = requestQuery3.f18165b;
                if (C5207g.m11106a(str7, LibraryShelfType.Search.getValue()) || C5207g.m11106a(str7, LibraryShelfType.SourceSearch.getValue())) {
                    str15 = null;
                } else {
                    str15 = str7;
                }
                Set<Integer> set5 = requestQuery3.f18168e;
                Set<String> set6 = requestQuery3.f18167d;
                if (str14.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    str16 = null;
                } else {
                    str16 = str14;
                }
                Boolean bool15 = requestQuery3.f18169f;
                Boolean bool16 = requestQuery3.f18170g;
                Integer num9 = requestQuery3.f18171h;
                List<String> list13 = requestQuery3.f18172i;
                List<String> list14 = requestQuery3.f18173j;
                Integer num10 = requestQuery3.f18174k;
                Integer num11 = new Integer(20);
                libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$4;
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = libraryRepositoryImpl;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str13;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str20;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str14;
                libraryRepositoryImpl$updateLibraryItems$2.f20112h = null;
                libraryRepositoryImpl$updateLibraryItems$2.f20113i = null;
                libraryRepositoryImpl$updateLibraryItems$2.f20114j = i25;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 3;
                i12 = i25;
                str10 = null;
                i11 = 0;
                libraryRepositoryImpl4 = libraryRepositoryImpl;
                coroutineSingletons = coroutineSingletons2;
                objM18483e = interfaceC9939g3.m18483e(str13, num11, str210, value, set5, str15, set6, str16, bool15, bool16, num9, list13, list14, num10, i12, C9000b.m17252r("netflix", "youtube"), libraryRepositoryImpl$updateLibraryItems$2);
                if (objM18483e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str17 = str20;
                str18 = str14;
                str11 = str13;
                results = (Results) objM18483e;
                str9 = str17;
                str12 = str18;
                libraryRepositoryImpl3 = libraryRepositoryImpl4;
                list = results.f19136d;
                if (list != 0) {
                    String strM15498b5 = C7793a.m15498b(str11, str9);
                    lingQDatabase = libraryRepositoryImpl3.f20063a;
                    libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b5, str12, str11, null);
                    libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                    libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                    libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                    if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    results2 = results;
                }
                list2 = results.f19136d;
                if (list2 != 0) {
                    size = list2.size();
                } else {
                    size = i11;
                }
                return new Integer(size);
            }
            bool3 = Boolean.TRUE;
            bool4 = bool3;
            if (C7076b.m14278X2(str8, "_my_imports_", false)) {
                bool5 = Boolean.TRUE;
            }
            Boolean bool17 = bool5;
            collectionsFilterProvider = librarySearchQuery.f22033j;
            if (collectionsFilterProvider != null) {
                num = collectionsFilterProvider.f21926a;
            } else {
                num = null;
            }
            List<String> list15 = librarySearchQuery.f22031h;
            if (C7793a.m15497a(str20) != null) {
                strM15497a = C7793a.m15497a(str20);
                if (strM15497a == null) {
                    strM15497a = "";
                }
                listM17251q = C9000b.m17251q(strM15497a);
            } else {
                List<Accent> list16 = librarySearchQuery.f22035l;
                arrayList = new ArrayList(C9325m.m17681z(list16, 10));
                it = list16.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Accent) it.next()).getValue());
                }
                listM17251q = arrayList;
            }
            collectionsFilterUser = librarySearchQuery.f22034k;
            if (collectionsFilterUser != null) {
                num2 = new Integer(collectionsFilterUser.f21932a);
            } else {
                num2 = null;
            }
            RequestQuery requestQuery4 = new RequestQuery(i24, value7, null, linkedHashSet, linkedHashSet2, bool4, bool17, num, list15, listM17251q, num2, 4, null);
            InterfaceC9939g interfaceC9939g4 = libraryRepositoryImpl.f20064b;
            LibraryContentType[] libraryContentTypeArrValues4 = LibraryContentType.values();
            arrayList2 = new ArrayList(libraryContentTypeArrValues4.length);
            while (i15 < r6) {
                arrayList2.add("_type=" + libraryContentType.getValue() + "_");
            }
            HashSet<String> hashSetM13451s3 = C6752c.m13451s0(arrayList2);
            String value10 = LibraryItemType.Content.getValue();
            value = value10;
            while (r1.hasNext()) {
                if (C7076b.m14278X2(str20, str22, false)) {
                    if (C5207g.m11106a(str22, "_type=" + LibraryContentType.Lessons.getValue() + "_")) {
                        value = LibraryItemType.Content.getValue();
                    } else {
                        String value11 = LibraryContentType.Courses.getValue();
                        StringBuilder sb5 = new StringBuilder("_type=");
                        sb5.append(value11);
                        sb5.append("_");
                        if (C5207g.m11106a(str22, sb5.toString())) {
                        }
                    }
                }
            }
            String str211 = requestQuery4.f18165b;
            if (C5207g.m11106a(str7, LibraryShelfType.Search.getValue())) {
                str15 = null;
            } else {
                str15 = null;
            }
            Set<Integer> set7 = requestQuery4.f18168e;
            Set<String> set8 = requestQuery4.f18167d;
            if (str14.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str16 = null;
            } else {
                str16 = str14;
            }
            Boolean bool18 = requestQuery4.f18169f;
            Boolean bool19 = requestQuery4.f18170g;
            Integer num12 = requestQuery4.f18171h;
            List<String> list17 = requestQuery4.f18172i;
            List<String> list18 = requestQuery4.f18173j;
            Integer num13 = requestQuery4.f18174k;
            Integer num14 = new Integer(20);
            libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$4;
            libraryRepositoryImpl$updateLibraryItems$2.f20108d = libraryRepositoryImpl;
            libraryRepositoryImpl$updateLibraryItems$2.f20109e = str13;
            libraryRepositoryImpl$updateLibraryItems$2.f20110f = str20;
            libraryRepositoryImpl$updateLibraryItems$2.f20111g = str14;
            libraryRepositoryImpl$updateLibraryItems$2.f20112h = null;
            libraryRepositoryImpl$updateLibraryItems$2.f20113i = null;
            libraryRepositoryImpl$updateLibraryItems$2.f20114j = i25;
            libraryRepositoryImpl$updateLibraryItems$2.f20107H = 3;
            i12 = i25;
            str10 = null;
            i11 = 0;
            libraryRepositoryImpl4 = libraryRepositoryImpl;
            coroutineSingletons = coroutineSingletons2;
            objM18483e = interfaceC9939g4.m18483e(str13, num14, str211, value, set7, str15, set8, str16, bool18, bool19, num12, list17, list18, num13, i12, C9000b.m17252r("netflix", "youtube"), libraryRepositoryImpl$updateLibraryItems$2);
            if (objM18483e == coroutineSingletons) {
                return coroutineSingletons;
            }
            str17 = str20;
            str18 = str14;
            str11 = str13;
            results = (Results) objM18483e;
            str9 = str17;
            str12 = str18;
            libraryRepositoryImpl3 = libraryRepositoryImpl4;
            list = results.f19136d;
            if (list != 0) {
                String strM15498b6 = C7793a.m15498b(str11, str9);
                lingQDatabase = libraryRepositoryImpl3.f20063a;
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b6, str12, str11, null);
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                results2 = results;
            }
            list2 = results.f19136d;
            if (list2 != 0) {
                size = list2.size();
            } else {
                size = i11;
            }
            return new Integer(size);
        }
        if (i18 == 3) {
            int i26 = libraryRepositoryImpl$updateLibraryItems$1.f20114j;
            str18 = libraryRepositoryImpl$updateLibraryItems$1.f20111g;
            String str33 = libraryRepositoryImpl$updateLibraryItems$1.f20110f;
            String str34 = libraryRepositoryImpl$updateLibraryItems$1.f20109e;
            LibraryRepositoryImpl libraryRepositoryImpl5 = (LibraryRepositoryImpl) libraryRepositoryImpl$updateLibraryItems$1.f20108d;
            C7499b.m14977z0(objM14360a);
            libraryRepositoryImpl4 = libraryRepositoryImpl5;
            str10 = null;
            i11 = 0;
            objM18483e = objM14360a;
            str11 = str34;
            str17 = str33;
            libraryRepositoryImpl$updateLibraryItems$2 = libraryRepositoryImpl$updateLibraryItems$1;
            i12 = i26;
            coroutineSingletons = coroutineSingletons2;
            results = (Results) objM18483e;
            str9 = str17;
            str12 = str18;
            libraryRepositoryImpl3 = libraryRepositoryImpl4;
            list = results.f19136d;
            if (list != 0) {
                String strM15498b7 = C7793a.m15498b(str11, str9);
                lingQDatabase = libraryRepositoryImpl3.f20063a;
                libraryRepositoryImpl$updateLibraryItems$2$1 = new LibraryRepositoryImpl$updateLibraryItems$2$1(list, libraryRepositoryImpl3, i12, strM15498b7, str12, str11, null);
                libraryRepositoryImpl$updateLibraryItems$2.f20108d = results;
                libraryRepositoryImpl$updateLibraryItems$2.f20109e = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20110f = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20111g = str10;
                libraryRepositoryImpl$updateLibraryItems$2.f20107H = 4;
                if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryItems$2$1, libraryRepositoryImpl$updateLibraryItems$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                results2 = results;
            }
            list2 = results.f19136d;
            if (list2 != 0) {
                size = list2.size();
            } else {
                size = i11;
            }
            return new Integer(size);
        }
        if (i18 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        results2 = (Results) libraryRepositoryImpl$updateLibraryItems$1.f20108d;
        C7499b.m14977z0(objM14360a);
        i11 = 0;
        results = results2;
        list2 = results.f19136d;
        if (list2 != 0) {
            size = list2.size();
        } else {
            size = i11;
        }
        return new Integer(size);
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: k */
    public final InterfaceC7116c mo6065k(List list) {
        return C0062b.m273H0(this.f20065c.mo5060K0(list));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: l */
    public final InterfaceC7116c mo6066l(String str, ArrayList arrayList) {
        return C0062b.m273H0(this.f20065c.mo5076s0(str, C6752c.m13430X(arrayList, null, null, null, null, 63)));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: m */
    public final InterfaceC7116c<List<C6333b>> mo6067m(List<Integer> list) {
        return C0062b.m273H0(this.f20065c.mo5058I0(list, LibraryItemType.Content.getValue()));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: n */
    public final InterfaceC7116c<List<C6333b>> mo6068n(List<Integer> list) {
        return C0062b.m273H0(this.f20065c.mo5058I0(list, LibraryItemType.Content.getValue()));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: o */
    public final InterfaceC7116c<List<C6332a>> mo6069o(int i10) {
        return C0062b.m273H0(this.f20065c.mo5074q0(LibraryItemType.Content.getValue(), i10));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0100 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: p */
    public final Object mo6070p(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c) throws Throwable {
        LibraryRepositoryImpl$updateLibraryShelves$1 libraryRepositoryImpl$updateLibraryShelves$1;
        Object objM18481c;
        LibraryRepositoryImpl libraryRepositoryImpl;
        List list;
        String str2;
        String str3;
        String str4;
        List list2;
        LingQDatabase lingQDatabase;
        LibraryRepositoryImpl$updateLibraryShelves$2 libraryRepositoryImpl$updateLibraryShelves$2;
        String str5 = str;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$updateLibraryShelves$1) {
            libraryRepositoryImpl$updateLibraryShelves$1 = (LibraryRepositoryImpl$updateLibraryShelves$1) interfaceC9968c;
            int i10 = libraryRepositoryImpl$updateLibraryShelves$1.f20131j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$updateLibraryShelves$1.f20131j = i10 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$updateLibraryShelves$1 = new LibraryRepositoryImpl$updateLibraryShelves$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$updateLibraryShelves$1 = new LibraryRepositoryImpl$updateLibraryShelves$1(this, interfaceC9968c);
        }
        LibraryRepositoryImpl$updateLibraryShelves$1 libraryRepositoryImpl$updateLibraryShelves$3 = libraryRepositoryImpl$updateLibraryShelves$1;
        Object objMo5051B0 = libraryRepositoryImpl$updateLibraryShelves$3.f20129h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = libraryRepositoryImpl$updateLibraryShelves$3.f20131j;
        String strM13430X = "";
        if (i11 != 0) {
            if (i11 == 1) {
                String str6 = (String) libraryRepositoryImpl$updateLibraryShelves$3.f20128g;
                List list3 = (List) libraryRepositoryImpl$updateLibraryShelves$3.f20127f;
                String str7 = libraryRepositoryImpl$updateLibraryShelves$3.f20126e;
                LibraryRepositoryImpl libraryRepositoryImpl2 = libraryRepositoryImpl$updateLibraryShelves$3.f20125d;
                C7499b.m14977z0(objMo5051B0);
                str2 = str6;
                str5 = str7;
                libraryRepositoryImpl = libraryRepositoryImpl2;
                list = list3;
                objM18481c = objMo5051B0;
            } else if (i11 == 2) {
                List list4 = (List) libraryRepositoryImpl$updateLibraryShelves$3.f20128g;
                String str8 = (String) libraryRepositoryImpl$updateLibraryShelves$3.f20127f;
                String str9 = libraryRepositoryImpl$updateLibraryShelves$3.f20126e;
                LibraryRepositoryImpl libraryRepositoryImpl3 = libraryRepositoryImpl$updateLibraryShelves$3.f20125d;
                C7499b.m14977z0(objMo5051B0);
                list2 = list4;
                str4 = str8;
                str3 = str9;
                libraryRepositoryImpl = libraryRepositoryImpl3;
                lingQDatabase = libraryRepositoryImpl.f20063a;
                libraryRepositoryImpl$updateLibraryShelves$2 = new LibraryRepositoryImpl$updateLibraryShelves$2((List) objMo5051B0, libraryRepositoryImpl, list2, str3, str4, null);
                libraryRepositoryImpl$updateLibraryShelves$3.f20125d = null;
                libraryRepositoryImpl$updateLibraryShelves$3.f20126e = null;
                libraryRepositoryImpl$updateLibraryShelves$3.f20127f = null;
                libraryRepositoryImpl$updateLibraryShelves$3.f20128g = null;
                libraryRepositoryImpl$updateLibraryShelves$3.f20131j = 3;
                if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryShelves$2, libraryRepositoryImpl$updateLibraryShelves$3) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5051B0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5051B0);
        String strM13430X2 = arrayList != null ? C6752c.m13430X(arrayList, null, null, null, null, 63) : "";
        libraryRepositoryImpl$updateLibraryShelves$3.f20125d = this;
        libraryRepositoryImpl$updateLibraryShelves$3.f20126e = str5;
        libraryRepositoryImpl$updateLibraryShelves$3.f20127f = arrayList;
        libraryRepositoryImpl$updateLibraryShelves$3.f20128g = strM13430X2;
        libraryRepositoryImpl$updateLibraryShelves$3.f20131j = 1;
        objM18481c = this.f20064b.m18481c(str5, C9000b.m17252r("netflix", "youtube"), arrayList, libraryRepositoryImpl$updateLibraryShelves$3);
        if (objM18481c == coroutineSingletons) {
            return coroutineSingletons;
        }
        libraryRepositoryImpl = this;
        list = arrayList;
        str2 = strM13430X2;
        List list5 = list;
        List list6 = (List) objM18481c;
        AbstractC1454i2 abstractC1454i2 = libraryRepositoryImpl.f20065c;
        if (list5 != null) {
            strM13430X = C6752c.m13430X(list5, null, null, null, null, 63);
        }
        libraryRepositoryImpl$updateLibraryShelves$3.f20125d = libraryRepositoryImpl;
        libraryRepositoryImpl$updateLibraryShelves$3.f20126e = str5;
        libraryRepositoryImpl$updateLibraryShelves$3.f20127f = str2;
        libraryRepositoryImpl$updateLibraryShelves$3.f20128g = list6;
        libraryRepositoryImpl$updateLibraryShelves$3.f20131j = 2;
        objMo5051B0 = abstractC1454i2.mo5051B0(str5, strM13430X, libraryRepositoryImpl$updateLibraryShelves$3);
        if (objMo5051B0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = str5;
        str4 = str2;
        list2 = list6;
        lingQDatabase = libraryRepositoryImpl.f20063a;
        libraryRepositoryImpl$updateLibraryShelves$2 = new LibraryRepositoryImpl$updateLibraryShelves$2((List) objMo5051B0, libraryRepositoryImpl, list2, str3, str4, null);
        libraryRepositoryImpl$updateLibraryShelves$3.f20125d = null;
        libraryRepositoryImpl$updateLibraryShelves$3.f20126e = null;
        libraryRepositoryImpl$updateLibraryShelves$3.f20127f = null;
        libraryRepositoryImpl$updateLibraryShelves$3.f20128g = null;
        libraryRepositoryImpl$updateLibraryShelves$3.f20131j = 3;
        if (RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$updateLibraryShelves$2, libraryRepositoryImpl$updateLibraryShelves$3) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: q */
    public final Object mo6071q(String str, int i10, Sort sort, List<String> list, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        LibraryRepositoryImpl$networkCourseLessonsSearch$1 libraryRepositoryImpl$networkCourseLessonsSearch$1;
        LibraryRepositoryImpl libraryRepositoryImpl;
        Results results;
        Results results2;
        int size;
        List<? extends ResultType> list2;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$networkCourseLessonsSearch$1) {
            libraryRepositoryImpl$networkCourseLessonsSearch$1 = (LibraryRepositoryImpl$networkCourseLessonsSearch$1) interfaceC9968c;
            int i11 = libraryRepositoryImpl$networkCourseLessonsSearch$1.f20090h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$networkCourseLessonsSearch$1.f20090h = i11 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$networkCourseLessonsSearch$1 = new LibraryRepositoryImpl$networkCourseLessonsSearch$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$networkCourseLessonsSearch$1 = new LibraryRepositoryImpl$networkCourseLessonsSearch$1(this, interfaceC9968c);
        }
        Object objM18484f = libraryRepositoryImpl$networkCourseLessonsSearch$1.f20088f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = libraryRepositoryImpl$networkCourseLessonsSearch$1.f20090h;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = libraryRepositoryImpl$networkCourseLessonsSearch$1.f20087e;
                libraryRepositoryImpl = (LibraryRepositoryImpl) libraryRepositoryImpl$networkCourseLessonsSearch$1.f20086d;
                C7499b.m14977z0(objM18484f);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                results2 = (Results) libraryRepositoryImpl$networkCourseLessonsSearch$1.f20086d;
                C7499b.m14977z0(objM18484f);
            }
            results = results2;
            if (results != null || (list2 = results.f19136d) == 0) {
                size = 0;
            } else {
                size = list2.size();
            }
            return new Integer(size);
        }
        C7499b.m14977z0(objM18484f);
        InterfaceC9939g interfaceC9939g = this.f20064b;
        Integer num = new Integer(i10);
        String value = sort.getValue();
        libraryRepositoryImpl$networkCourseLessonsSearch$1.f20086d = this;
        libraryRepositoryImpl$networkCourseLessonsSearch$1.f20087e = i10;
        libraryRepositoryImpl$networkCourseLessonsSearch$1.f20090h = 1;
        objM18484f = interfaceC9939g.m18484f(str, num, value, LibraryItemType.Content.getValue(), 1000, 1, list, libraryRepositoryImpl$networkCourseLessonsSearch$1);
        if (objM18484f == coroutineSingletons) {
            return coroutineSingletons;
        }
        libraryRepositoryImpl = this;
        results = (Results) objM18484f;
        if (results != null) {
            LingQDatabase lingQDatabase = libraryRepositoryImpl.f20063a;
            LibraryRepositoryImpl$networkCourseLessonsSearch$2$1 libraryRepositoryImpl$networkCourseLessonsSearch$2$1 = new LibraryRepositoryImpl$networkCourseLessonsSearch$2$1(results, libraryRepositoryImpl, i10, null);
            libraryRepositoryImpl$networkCourseLessonsSearch$1.f20086d = results;
            libraryRepositoryImpl$networkCourseLessonsSearch$1.f20090h = 2;
            objM18484f = RoomDatabaseKt.m4573a(lingQDatabase, libraryRepositoryImpl$networkCourseLessonsSearch$2$1, libraryRepositoryImpl$networkCourseLessonsSearch$1);
            if (objM18484f == coroutineSingletons) {
                return coroutineSingletons;
            }
            results2 = results;
            results = results2;
        }
        if (results != null) {
            size = 0;
        } else {
            size = 0;
        }
        return new Integer(size);
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: r */
    public final InterfaceC7116c<C6332a> mo6072r(int i10) {
        return C0062b.m273H0(this.f20065c.mo5062M0(i10));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: s */
    public final Object mo6073s(String str, String str2, InterfaceC9968c<? super LibraryShelf> interfaceC9968c) {
        return this.f20065c.mo5050A0(str, str2, interfaceC9968c);
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c mo6074t(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "type");
        C5207g.m11111f(str3, "query");
        String strM15498b = C7793a.m15498b(str, str2);
        boolean z10 = str3.length() == 0;
        AbstractC1454i2 abstractC1454i2 = this.f20065c;
        return z10 ? C0062b.m273H0(abstractC1454i2.mo5064O0(strM15498b, i10)) : C0062b.m273H0(abstractC1454i2.mo5065P0(strM15498b, i10, str3));
    }

    @Override // ci.InterfaceC2014g
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<List<LibraryItemCounter>> mo6075u(List<Pair<Integer, String>> list) {
        C5207g.m11111f(list, "idsWithTypes");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.f38012a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(pair.f38013b);
            arrayList.add(sb2.toString());
        }
        return C0062b.m273H0(this.f20065c.mo5061L0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: v */
    public final Object m9540v(int i10, String str, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        LibraryRepositoryImpl$networkBuyCourse$1 libraryRepositoryImpl$networkBuyCourse$1;
        if (interfaceC9968c instanceof LibraryRepositoryImpl$networkBuyCourse$1) {
            libraryRepositoryImpl$networkBuyCourse$1 = (LibraryRepositoryImpl$networkBuyCourse$1) interfaceC9968c;
            int i11 = libraryRepositoryImpl$networkBuyCourse$1.f20081f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                libraryRepositoryImpl$networkBuyCourse$1.f20081f = i11 - Integer.MIN_VALUE;
            } else {
                libraryRepositoryImpl$networkBuyCourse$1 = new LibraryRepositoryImpl$networkBuyCourse$1(this, interfaceC9968c);
            }
        } else {
            libraryRepositoryImpl$networkBuyCourse$1 = new LibraryRepositoryImpl$networkBuyCourse$1(this, interfaceC9968c);
        }
        Object objM18479a = libraryRepositoryImpl$networkBuyCourse$1.f20079d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = libraryRepositoryImpl$networkBuyCourse$1.f20081f;
        if (i12 == 0) {
            C7499b.m14977z0(objM18479a);
            Integer num = new Integer(i10);
            libraryRepositoryImpl$networkBuyCourse$1.f20081f = 1;
            objM18479a = this.f20064b.m18479a(str, num, libraryRepositoryImpl$networkBuyCourse$1);
            if (objM18479a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(objM18479a);
        }
        C6553u c6553u = (C6553u) objM18479a;
        return Boolean.valueOf(c6553u != null && c6553u.f37338a.m17350l());
    }
}

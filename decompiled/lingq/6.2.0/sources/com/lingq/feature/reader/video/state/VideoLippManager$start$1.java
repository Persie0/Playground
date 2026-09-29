package com.lingq.feature.reader.video.state;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.c32;
import p000.e37;
import p000.i84;
import p000.lw8;
import p000.u91;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoLippManager$start$1", m4291f = "VideoLippManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoLippManager$start$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Integer f31515a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ i84 f31516b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31517c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2596b f31518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoLippManager$start$1(C2596b c2596b, Continuation continuation) {
        super(4, continuation);
        this.f31518d = c2596b;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        VideoLippManager$start$1 videoLippManager$start$1 = new VideoLippManager$start$1(this.f31518d, (Continuation) obj4);
        videoLippManager$start$1.f31515a = (Integer) obj;
        videoLippManager$start$1.f31516b = (i84) obj2;
        videoLippManager$start$1.f31517c = (List) obj3;
        return videoLippManager$start$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num = this.f31515a;
        i84 i84Var = this.f31516b;
        List list = this.f31517c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty()) {
            return EmptyList.f47638a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (num != null) {
            Iterator it = list.iterator();
            int i = 0;
            loop0: while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                List list2 = ((e37) it.next()).f36654c;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((lw8) it2.next()).f50212a == num.intValue()) {
                            break loop0;
                        }
                    }
                }
                i++;
            }
            if (i >= 0) {
                int i2 = i - 10;
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = i + 10;
                int size = list.size() - 1;
                if (i3 > size) {
                    i3 = size;
                }
                if (i2 <= i3) {
                    while (true) {
                        Iterator it3 = ((e37) list.get(i2)).f36654c.iterator();
                        while (it3.hasNext()) {
                            linkedHashSet.add(Integer.valueOf(((lw8) it3.next()).f50212a));
                        }
                        if (i2 == i3) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        if (!i84Var.isEmpty()) {
            int i4 = i84Var.f40379a - 10;
            int i5 = i4 >= 0 ? i4 : 0;
            int i6 = i84Var.f40380b + 10;
            int size2 = list.size() - 1;
            if (i6 > size2) {
                i6 = size2;
            }
            if (i5 <= i6) {
                while (true) {
                    Iterator it4 = ((e37) list.get(i5)).f36654c.iterator();
                    while (it4.hasNext()) {
                        linkedHashSet.add(Integer.valueOf(((lw8) it4.next()).f50212a));
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5++;
                }
            }
        }
        return u91.m22613e1(linkedHashSet);
    }
}

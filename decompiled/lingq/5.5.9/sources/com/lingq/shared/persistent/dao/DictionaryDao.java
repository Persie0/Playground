package com.lingq.shared.persistent.dao;

import android.support.v4.media.AbstractC0140a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C7136q;
import p260m8.C7499b;
import p367rh.C8794h;
import p367rh.C8796j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class DictionaryDao extends AbstractC0140a {
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u0 */
    public static Object m9472u0(DictionaryDao dictionaryDao, int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DictionaryDao$removeActiveDictionary$1 dictionaryDao$removeActiveDictionary$1;
        if (interfaceC9968c instanceof DictionaryDao$removeActiveDictionary$1) {
            dictionaryDao$removeActiveDictionary$1 = (DictionaryDao$removeActiveDictionary$1) interfaceC9968c;
            int i11 = dictionaryDao$removeActiveDictionary$1.f19374i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dictionaryDao$removeActiveDictionary$1.f19374i = i11 - Integer.MIN_VALUE;
            } else {
                dictionaryDao$removeActiveDictionary$1 = new DictionaryDao$removeActiveDictionary$1(dictionaryDao, interfaceC9968c);
            }
        } else {
            dictionaryDao$removeActiveDictionary$1 = new DictionaryDao$removeActiveDictionary$1(dictionaryDao, interfaceC9968c);
        }
        Object obj = dictionaryDao$removeActiveDictionary$1.f19372g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = dictionaryDao$removeActiveDictionary$1.f19374i;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = dictionaryDao$removeActiveDictionary$1.f19371f;
                str = dictionaryDao$removeActiveDictionary$1.f19370e;
                dictionaryDao = dictionaryDao$removeActiveDictionary$1.f19369d;
                C7499b.m14977z0(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        dictionaryDao$removeActiveDictionary$1.f19369d = dictionaryDao;
        dictionaryDao$removeActiveDictionary$1.f19370e = str;
        dictionaryDao$removeActiveDictionary$1.f19371f = i10;
        dictionaryDao$removeActiveDictionary$1.f19374i = 1;
        if (dictionaryDao.mo5099w0(i10, -1, dictionaryDao$removeActiveDictionary$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        C8794h c8794h = new C8794h(str, i10);
        dictionaryDao$removeActiveDictionary$1.f19369d = null;
        dictionaryDao$removeActiveDictionary$1.f19370e = null;
        dictionaryDao$removeActiveDictionary$1.f19374i = 2;
        return dictionaryDao.mo5098v0(c8794h, dictionaryDao$removeActiveDictionary$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract C7136q mo5088k0(String str);

    /* JADX INFO: renamed from: l0 */
    public abstract C7136q mo5089l0(String str);

    /* JADX INFO: renamed from: m0 */
    public abstract Object mo5090m0(String str, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: n0 */
    public abstract C7136q mo5091n0(String str);

    /* JADX INFO: renamed from: o0 */
    public abstract C7136q mo5092o0(String str, String str2);

    /* JADX INFO: renamed from: p0 */
    public abstract Object mo5093p0(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: q0 */
    public abstract Object mo5094q0(int i10, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: r0 */
    public abstract Object mo5095r0(C8794h c8794h, ContinuationImpl continuationImpl);

    /* JADX INFO: renamed from: s0 */
    public abstract Object mo5096s0(C8796j c8796j, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: t0 */
    public Object mo5097t0(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return m9472u0(this, i10, str, interfaceC9968c);
    }

    /* JADX INFO: renamed from: v0 */
    public abstract Object mo5098v0(C8794h c8794h, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: w0 */
    public abstract Object mo5099w0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: x0 */
    public abstract Object mo5100x0(int i10, int i11, InterfaceC9968c<? super C9072e> interfaceC9968c);
}

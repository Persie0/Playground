package com.google.android.gms.internal.measurement;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.google.android.gms.internal.measurement.AbstractC2742l5;
import com.google.android.gms.internal.measurement.AbstractC2756m5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2756m5<MessageType extends AbstractC2756m5<MessageType, BuilderType>, BuilderType extends AbstractC2742l5<MessageType, BuilderType>> implements InterfaceC2730k7 {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static void m8064f(Iterable iterable, InterfaceC2836s6 interfaceC2836s6) {
        Charset charset = C2849t6.f14439a;
        iterable.getClass();
        if (iterable instanceof InterfaceC2888w6) {
            List listMo8052e = ((InterfaceC2888w6) iterable).mo8052e();
            InterfaceC2888w6 interfaceC2888w6 = (InterfaceC2888w6) interfaceC2836s6;
            int size = interfaceC2836s6.size();
            for (Object obj : listMo8052e) {
                if (obj == null) {
                    String strM762h = C0166e.m762h("Element at index ", interfaceC2888w6.size() - size, " is null.");
                    int size2 = interfaceC2888w6.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            throw new NullPointerException(strM762h);
                        }
                        interfaceC2888w6.remove(size2);
                    }
                } else if (obj instanceof zzka) {
                    interfaceC2888w6.mo8053i0((zzka) obj);
                } else {
                    interfaceC2888w6.add((String) obj);
                }
            }
        } else {
            if (iterable instanceof InterfaceC2824r7) {
                interfaceC2836s6.addAll((Collection) iterable);
                return;
            }
            if ((interfaceC2836s6 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) interfaceC2836s6).ensureCapacity(((Collection) iterable).size() + interfaceC2836s6.size());
            }
            int size3 = interfaceC2836s6.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String strM762h2 = C0166e.m762h("Element at index ", interfaceC2836s6.size() - size3, " is null.");
                    int size4 = interfaceC2836s6.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            throw new NullPointerException(strM762h2);
                        }
                        interfaceC2836s6.remove(size4);
                    }
                } else {
                    interfaceC2836s6.add(obj2);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public int mo8065a(InterfaceC2876v7 interfaceC2876v7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2730k7
    /* JADX INFO: renamed from: e */
    public final zzka mo7922e() {
        try {
            AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) this;
            int iMo7920b = abstractC2771n6.mo7920b();
            zzka zzkaVar = zzka.f14563b;
            byte[] bArr = new byte[iMo7920b];
            Logger logger = AbstractC2887w5.f14492Q;
            C2874v5 c2874v5 = new C2874v5(bArr, iMo7920b);
            InterfaceC2876v7 interfaceC2876v7M8253a = C2837s7.f14426c.m8253a(abstractC2771n6.getClass());
            C2900x5 c2900x5 = c2874v5.f14494P;
            if (c2900x5 == null) {
                c2900x5 = new C2900x5(c2874v5);
            }
            interfaceC2876v7M8253a.mo8107c(abstractC2771n6, c2900x5);
            if (c2874v5.m8318P1() == 0) {
                return new zzjx(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(C0141b.m611g("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final byte[] m8066g() {
        try {
            AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) this;
            int iMo7920b = abstractC2771n6.mo7920b();
            byte[] bArr = new byte[iMo7920b];
            Logger logger = AbstractC2887w5.f14492Q;
            C2874v5 c2874v5 = new C2874v5(bArr, iMo7920b);
            InterfaceC2876v7 interfaceC2876v7M8253a = C2837s7.f14426c.m8253a(abstractC2771n6.getClass());
            C2900x5 c2900x5 = c2874v5.f14494P;
            if (c2900x5 == null) {
                c2900x5 = new C2900x5(c2874v5);
            }
            interfaceC2876v7M8253a.mo8107c(abstractC2771n6, c2900x5);
            if (c2874v5.m8318P1() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(C0141b.m611g("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}

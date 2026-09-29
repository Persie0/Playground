package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2771n6;
import com.google.android.gms.internal.measurement.C2715j6;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j6 */
/* JADX INFO: loaded from: classes.dex */
public class C2715j6<MessageType extends AbstractC2771n6<MessageType, BuilderType>, BuilderType extends C2715j6<MessageType, BuilderType>> extends AbstractC2742l5<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a */
    public final AbstractC2771n6 f14270a;

    /* JADX INFO: renamed from: b */
    public AbstractC2771n6 f14271b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C2715j6(MessageType messagetype) {
        this.f14270a = messagetype;
        if (messagetype.m8089r()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f14271b = (AbstractC2771n6) messagetype.mo7659s(4);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C2715j6 clone() {
        C2715j6 c2715j6 = (C2715j6) this.f14270a.mo7659s(5);
        c2715j6.f14271b = m7898i();
        return c2715j6;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m7896g(byte[] bArr, int i10, C2589a6 c2589a6) throws zzll {
        if (!this.f14271b.m8089r()) {
            AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) this.f14270a.mo7659s(4);
            C2837s7.f14426c.m8253a(abstractC2771n6.getClass()).mo8112h(abstractC2771n6, this.f14271b);
            this.f14271b = abstractC2771n6;
        }
        try {
            C2837s7.f14426c.m8253a(this.f14271b.getClass()).mo8110f(this.f14271b, bArr, 0, i10, new C2796p5(c2589a6));
        } catch (zzll e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw zzll.m8503d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType m7897h() {
        MessageType messagetype = (MessageType) m7898i();
        byte bByteValue = ((Byte) messagetype.mo7659s(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue != 0) {
                boolean zMo8108d = C2837s7.f14426c.m8253a(messagetype.getClass()).mo8108d(messagetype);
                messagetype.mo7659s(2);
            }
            throw new zznj();
        }
        return messagetype;
    }

    /* JADX INFO: renamed from: i */
    public final MessageType m7898i() {
        if (!this.f14271b.m8089r()) {
            return (MessageType) this.f14271b;
        }
        AbstractC2771n6 abstractC2771n6 = this.f14271b;
        abstractC2771n6.getClass();
        C2837s7.f14426c.m8253a(abstractC2771n6.getClass()).mo8105a(abstractC2771n6);
        abstractC2771n6.m8087o();
        return (MessageType) this.f14271b;
    }

    /* JADX INFO: renamed from: j */
    public final void m7899j() {
        if (!this.f14271b.m8089r()) {
            AbstractC2771n6 abstractC2771n6 = (AbstractC2771n6) this.f14270a.mo7659s(4);
            C2837s7.f14426c.m8253a(abstractC2771n6.getClass()).mo8112h(abstractC2771n6, this.f14271b);
            this.f14271b = abstractC2771n6;
        }
    }
}

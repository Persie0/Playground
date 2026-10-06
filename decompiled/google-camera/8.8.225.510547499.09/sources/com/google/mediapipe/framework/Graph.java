package com.google.mediapipe.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.lku;
import p000.mbb;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class Graph {

    /* JADX INFO: renamed from: a */
    private static final nbh f8414a = nbh.m17259h("com/google/mediapipe/framework/Graph");

    /* JADX INFO: renamed from: c */
    private final List f8416c = new ArrayList();

    /* JADX INFO: renamed from: d */
    private final Map f8417d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Map f8418e = new HashMap();

    /* JADX INFO: renamed from: f */
    private boolean f8419f = false;

    /* JADX INFO: renamed from: g */
    private boolean f8420g = false;

    /* JADX INFO: renamed from: h */
    private final Map f8421h = new HashMap();

    /* JADX INFO: renamed from: b */
    private final long f8415b = nativeCreateGraph();

    /* JADX INFO: renamed from: i */
    private static void m5174i(Map map, String[] strArr, long[] jArr) {
        if (map.size() != strArr.length || map.size() != jArr.length) {
            throw new RuntimeException("Input array length doesn't match the map size!");
        }
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            strArr[i] = (String) entry.getKey();
            jArr[i] = ((Packet) entry.getValue()).getNativeHandle();
            i++;
        }
    }

    private native void nativeAddPacketCallback(long j, String str, PacketCallback packetCallback);

    private native long nativeAddSurfaceOutput(long j, String str);

    private native long nativeCreateGraph();

    private native void nativeLoadBinaryGraph(long j, String str);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    /* JADX INFO: renamed from: a */
    public final synchronized long m5175a() {
        return this.f8415b;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5176b(String str, Packet packet, long j) {
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called.");
        if (this.f8420g) {
            nativeMovePacketToInputStream(this.f8415b, str, packet.getNativeHandle(), j);
            packet.release();
            return;
        }
        Packet packet2 = new Packet(packet.nativeCopyPacket(packet.f8431a));
        if (!this.f8421h.containsKey(str)) {
            this.f8421h.put(str, new ArrayList());
        }
        List list = (List) this.f8421h.get(str);
        if (list.size() <= 20) {
            list.add(new mbb(packet2, Long.valueOf(j)));
            packet.release();
            return;
        }
        for (Map.Entry entry : this.f8418e.entrySet()) {
            if (entry.getValue() == null) {
                ((nbe) ((nbe) f8414a.m17251b()).mo17276G((char) 4602)).mo17293r("Stream: %s might be missing.", entry.getKey());
            }
        }
        throw new RuntimeException("Graph is not started because of missing streams");
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m5177c(String str, PacketCallback packetCallback) {
        boolean z = true;
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called already.");
        if (this.f8420g || this.f8419f) {
            z = false;
        }
        lku.m15613H(z);
        this.f8416c.add(packetCallback);
        nativeAddPacketCallback(this.f8415b, str, packetCallback);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5178d(String str) {
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraph(this.f8415b, str);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m5179e(byte[] bArr) {
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called already.");
        nativeLoadBinaryGraphBytes(this.f8415b, bArr);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m5180f(long j) {
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called already.");
        lku.m15613H(!this.f8420g);
        nativeSetParentGlContext(this.f8415b, j);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m5181g() {
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called.");
        this.f8419f = true;
        Iterator it = this.f8418e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == null) {
                return;
            }
        }
        String[] strArr = new String[this.f8417d.size()];
        long[] jArr = new long[this.f8417d.size()];
        m5174i(this.f8417d, strArr, jArr);
        String[] strArr2 = new String[this.f8418e.size()];
        long[] jArr2 = new long[this.f8418e.size()];
        m5174i(this.f8418e, strArr2, jArr2);
        nativeStartRunningGraph(this.f8415b, strArr, jArr, strArr2, jArr2);
        this.f8420g = true;
        if (!this.f8421h.isEmpty()) {
            for (Map.Entry entry : this.f8421h.entrySet()) {
                ArrayList arrayList = (ArrayList) entry.getValue();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    mbb mbbVar = (mbb) arrayList.get(i);
                    try {
                        nativeMovePacketToInputStream(this.f8415b, (String) entry.getKey(), ((Packet) mbbVar.f39761b).getNativeHandle(), ((Long) mbbVar.f39760a).longValue());
                        ((Packet) mbbVar.f39761b).release();
                    } catch (MediaPipeException e) {
                        ((nbe) ((nbe) f8414a.m17251b()).mo17276G(4600)).mo17301z("AddPacket for stream: %s failed: %s.", entry.getKey(), e.getMessage());
                        throw e;
                    }
                }
            }
            this.f8421h.clear();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m5182h(String str) {
        boolean z = true;
        lku.m15614I(this.f8415b != 0, "Invalid context, tearDown() might have been called.");
        str.getClass();
        if (this.f8420g || this.f8419f) {
            z = false;
        }
        lku.m15613H(z);
        nativeAddSurfaceOutput(this.f8415b, str);
    }
}

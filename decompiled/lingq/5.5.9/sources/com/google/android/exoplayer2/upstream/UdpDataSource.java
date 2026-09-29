package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import p454wa.AbstractC9879d;
import p454wa.C9884i;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends AbstractC9879d {

    /* JADX INFO: renamed from: e */
    public final int f13720e;

    /* JADX INFO: renamed from: f */
    public final byte[] f13721f;

    /* JADX INFO: renamed from: g */
    public final DatagramPacket f13722g;

    /* JADX INFO: renamed from: h */
    public Uri f13723h;

    /* JADX INFO: renamed from: i */
    public DatagramSocket f13724i;

    /* JADX INFO: renamed from: j */
    public MulticastSocket f13725j;

    /* JADX INFO: renamed from: k */
    public InetAddress f13726k;

    /* JADX INFO: renamed from: l */
    public boolean f13727l;

    /* JADX INFO: renamed from: m */
    public int f13728m;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Exception exc, int i10) {
            super(exc, i10);
        }
    }

    public UdpDataSource() {
        super(true);
        this.f13720e = 8000;
        byte[] bArr = new byte[2000];
        this.f13721f = bArr;
        this.f13722g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() {
        this.f13723h = null;
        MulticastSocket multicastSocket = this.f13725j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f13726k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f13725j = null;
        }
        DatagramSocket datagramSocket = this.f13724i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13724i = null;
        }
        this.f13726k = null;
        this.f13728m = 0;
        if (this.f13727l) {
            this.f13727l = false;
            m18377o();
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws UdpDataSourceException {
        Uri uri = c9884i.f50436a;
        this.f13723h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f13723h.getPort();
        m18378p(c9884i);
        try {
            this.f13726k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f13726k, port);
            if (this.f13726k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f13725j = multicastSocket;
                multicastSocket.joinGroup(this.f13726k);
                this.f13724i = this.f13725j;
            } else {
                this.f13724i = new DatagramSocket(inetSocketAddress);
            }
            this.f13724i.setSoTimeout(this.f13720e);
            this.f13727l = true;
            m18379q(c9884i);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f13723h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f13728m;
        DatagramPacket datagramPacket = this.f13722g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f13724i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f13728m = length;
                m18376n(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f13728m;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.f13721f, length2 - i13, bArr, i10, iMin);
        this.f13728m -= iMin;
        return iMin;
    }
}

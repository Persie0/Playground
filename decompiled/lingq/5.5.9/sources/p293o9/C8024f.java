package p293o9;

import android.support.v4.media.C0141b;
import com.google.android.exoplayer2.C2416m;
import com.google.common.collect.ImmutableList;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: o9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8024f implements InterfaceC8019a {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<InterfaceC8019a> f43651a;

    /* JADX INFO: renamed from: b */
    public final int f43652b;

    public C8024f(int i10, ImmutableList<InterfaceC8019a> immutableList) {
        this.f43652b = i10;
        this.f43651a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: b */
    public static C8024f m15897b(int i10, C10151t c10151t) {
        InterfaceC8019a c8025g;
        String str;
        String str2;
        InterfaceC8019a c8025g2;
        ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
        int i11 = c10151t.f51440c;
        int i12 = -2;
        while (c10151t.f51440c - c10151t.f51439b > 8) {
            int iM19132g = c10151t.m19132g();
            int iM19132g2 = c10151t.f51439b + c10151t.m19132g();
            c10151t.m19123D(iM19132g2);
            if (iM19132g != 1414744396) {
                switch (iM19132g) {
                    case 1718776947:
                        if (i12 == 2) {
                            c10151t.m19125F(4);
                            int iM19132g3 = c10151t.m19132g();
                            int iM19132g4 = c10151t.m19132g();
                            c10151t.m19125F(4);
                            int iM19132g5 = c10151t.m19132g();
                            switch (iM19132g5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                C2416m.a aVar = new C2416m.a();
                                aVar.f12506p = iM19132g3;
                                aVar.f12507q = iM19132g4;
                                aVar.f12501k = str2;
                                c8025g2 = new C8025g(new C2416m(aVar));
                                c8025g = c8025g2;
                            } else {
                                C0141b.m620p("Ignoring track with unsupported compression ", iM19132g5, "StreamFormatChunk");
                            }
                        } else if (i12 == 1) {
                            int iM19137l = c10151t.m19137l();
                            if (iM19137l == 1) {
                                str = "audio/raw";
                            } else if (iM19137l == 85) {
                                str = "audio/mpeg";
                            } else if (iM19137l == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iM19137l != 8192) {
                                str = iM19137l != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iM19137l2 = c10151t.m19137l();
                                int iM19132g6 = c10151t.m19132g();
                                c10151t.m19125F(6);
                                int iM19054u = C10134c0.m19054u(c10151t.m19150y());
                                int iM19137l3 = c10151t.m19137l();
                                byte[] bArr = new byte[iM19137l3];
                                c10151t.m19127b(bArr, 0, iM19137l3);
                                C2416m.a aVar2 = new C2416m.a();
                                aVar2.f12501k = str;
                                aVar2.f12514x = iM19137l2;
                                aVar2.f12515y = iM19132g6;
                                if ("audio/raw".equals(str) && iM19054u != 0) {
                                    aVar2.f12516z = iM19054u;
                                }
                                if ("audio/mp4a-latm".equals(str) && iM19137l3 > 0) {
                                    aVar2.f12503m = ImmutableList.m9064b0(bArr);
                                }
                                c8025g = new C8025g(new C2416m(aVar2));
                            } else {
                                C0141b.m620p("Ignoring track with unsupported format tag ", iM19137l, "StreamFormatChunk");
                            }
                        } else {
                            C10145n.m19099g("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + C10134c0.m19016A(i12));
                        }
                        c8025g = null;
                        break;
                    case 1751742049:
                        int iM19132g7 = c10151t.m19132g();
                        c10151t.m19125F(8);
                        int iM19132g8 = c10151t.m19132g();
                        int iM19132g9 = c10151t.m19132g();
                        c10151t.m19125F(4);
                        c10151t.m19132g();
                        c10151t.m19125F(12);
                        c8025g = new C8021c(iM19132g7, iM19132g8, iM19132g9);
                        break;
                    case 1752331379:
                        int iM19132g10 = c10151t.m19132g();
                        c10151t.m19125F(12);
                        c10151t.m19132g();
                        int iM19132g11 = c10151t.m19132g();
                        int iM19132g12 = c10151t.m19132g();
                        c10151t.m19125F(4);
                        int iM19132g13 = c10151t.m19132g();
                        int iM19132g14 = c10151t.m19132g();
                        c10151t.m19125F(8);
                        c8025g2 = new C8022d(iM19132g10, iM19132g11, iM19132g12, iM19132g13, iM19132g14);
                        c8025g = c8025g2;
                        break;
                    case 1852994675:
                        c8025g = new C8026h(c10151t.m19142q(c10151t.f51440c - c10151t.f51439b));
                        break;
                    default:
                        c8025g = null;
                        break;
                }
            } else {
                c8025g = m15897b(c10151t.m19132g(), c10151t);
            }
            if (c8025g != null) {
                if (c8025g.mo15893c() == 1752331379) {
                    int i13 = ((C8022d) c8025g).f43634a;
                    if (i13 == 1935960438) {
                        i12 = 2;
                    } else if (i13 == 1935963489) {
                        i12 = 1;
                    } else if (i13 != 1937012852) {
                        C10145n.m19099g("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i13));
                        i12 = -1;
                    } else {
                        i12 = 3;
                    }
                }
                c3146a.m9055b(c8025g);
            }
            c10151t.m19124E(iM19132g2);
            c10151t.m19123D(i11);
        }
        return new C8024f(i10, c3146a.m9068e());
    }

    /* JADX INFO: renamed from: a */
    public final <T extends InterfaceC8019a> T m15898a(Class<T> cls) {
        ImmutableList.C3147b c3147bListIterator = this.f43651a.listIterator(0);
        while (c3147bListIterator.hasNext()) {
            T t10 = (T) c3147bListIterator.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // p293o9.InterfaceC8019a
    /* JADX INFO: renamed from: c */
    public final int mo15893c() {
        return this.f43652b;
    }
}

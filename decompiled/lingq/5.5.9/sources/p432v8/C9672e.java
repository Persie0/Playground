package p432v8;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;

/* JADX INFO: renamed from: v8.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9672e extends AbstractC9676i {

    /* JADX INFO: renamed from: a */
    public final long f49534a;

    /* JADX INFO: renamed from: b */
    public final long f49535b;

    /* JADX INFO: renamed from: c */
    public final ClientInfo f49536c;

    /* JADX INFO: renamed from: d */
    public final Integer f49537d;

    /* JADX INFO: renamed from: e */
    public final String f49538e;

    /* JADX INFO: renamed from: f */
    public final List<AbstractC9675h> f49539f;

    /* JADX INFO: renamed from: g */
    public final QosTier f49540g;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9672e() {
        throw null;
    }

    public C9672e(long j10, long j11, ClientInfo clientInfo, Integer num, String str, List list, QosTier qosTier) {
        this.f49534a = j10;
        this.f49535b = j11;
        this.f49536c = clientInfo;
        this.f49537d = num;
        this.f49538e = str;
        this.f49539f = list;
        this.f49540g = qosTier;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: a */
    public final ClientInfo mo18176a() {
        return this.f49536c;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: b */
    public final List<AbstractC9675h> mo18177b() {
        return this.f49539f;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: c */
    public final Integer mo18178c() {
        return this.f49537d;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: d */
    public final String mo18179d() {
        return this.f49538e;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: e */
    public final QosTier mo18180e() {
        return this.f49540g;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:46:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        Integer num;
        String str;
        List<AbstractC9675h> list;
        QosTier qosTier;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9676i)) {
            return false;
        }
        AbstractC9676i abstractC9676i = (AbstractC9676i) obj;
        if (this.f49534a == abstractC9676i.mo18181f() && this.f49535b == abstractC9676i.mo18182g()) {
            ClientInfo clientInfo = this.f49536c;
            if (clientInfo == null) {
                if (abstractC9676i.mo18176a() == null) {
                    num = this.f49537d;
                    if (num == null ? num.equals(abstractC9676i.mo18178c()) : abstractC9676i.mo18178c() == null) {
                        str = this.f49538e;
                        if (str == null) {
                            if (abstractC9676i.mo18179d() == null) {
                                list = this.f49539f;
                                if (list == null) {
                                    if (abstractC9676i.mo18177b() == null) {
                                        qosTier = this.f49540g;
                                        if (qosTier == null) {
                                            if (abstractC9676i.mo18180e() == null) {
                                                return true;
                                            }
                                        } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                            return true;
                                        }
                                    }
                                } else if (list.equals(abstractC9676i.mo18177b())) {
                                    qosTier = this.f49540g;
                                    if (qosTier == null) {
                                        if (abstractC9676i.mo18180e() == null) {
                                            return true;
                                        }
                                    } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                        return true;
                                    }
                                }
                            }
                        } else if (str.equals(abstractC9676i.mo18179d())) {
                            list = this.f49539f;
                            if (list == null) {
                                if (abstractC9676i.mo18177b() == null) {
                                    qosTier = this.f49540g;
                                    if (qosTier == null) {
                                        if (abstractC9676i.mo18180e() == null) {
                                            return true;
                                        }
                                    } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                        return true;
                                    }
                                }
                            } else if (list.equals(abstractC9676i.mo18177b())) {
                                qosTier = this.f49540g;
                                if (qosTier == null) {
                                    if (abstractC9676i.mo18180e() == null) {
                                        return true;
                                    }
                                } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (clientInfo.equals(abstractC9676i.mo18176a())) {
                num = this.f49537d;
                if (num == null) {
                    str = this.f49538e;
                    if (str == null) {
                        if (abstractC9676i.mo18179d() == null) {
                            list = this.f49539f;
                            if (list == null) {
                                if (abstractC9676i.mo18177b() == null) {
                                    qosTier = this.f49540g;
                                    if (qosTier == null) {
                                        if (abstractC9676i.mo18180e() == null) {
                                            return true;
                                        }
                                    } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                        return true;
                                    }
                                }
                            } else if (list.equals(abstractC9676i.mo18177b())) {
                                qosTier = this.f49540g;
                                if (qosTier == null) {
                                    if (abstractC9676i.mo18180e() == null) {
                                        return true;
                                    }
                                } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                    return true;
                                }
                            }
                        }
                    } else if (str.equals(abstractC9676i.mo18179d())) {
                        list = this.f49539f;
                        if (list == null) {
                            if (abstractC9676i.mo18177b() == null) {
                                qosTier = this.f49540g;
                                if (qosTier == null) {
                                    if (abstractC9676i.mo18180e() == null) {
                                        return true;
                                    }
                                } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                    return true;
                                }
                            }
                        } else if (list.equals(abstractC9676i.mo18177b())) {
                            qosTier = this.f49540g;
                            if (qosTier == null) {
                                if (abstractC9676i.mo18180e() == null) {
                                    return true;
                                }
                            } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                return true;
                            }
                        }
                    }
                } else {
                    str = this.f49538e;
                    if (str == null) {
                        if (abstractC9676i.mo18179d() == null) {
                            list = this.f49539f;
                            if (list == null) {
                                if (abstractC9676i.mo18177b() == null) {
                                    qosTier = this.f49540g;
                                    if (qosTier == null) {
                                        if (abstractC9676i.mo18180e() == null) {
                                            return true;
                                        }
                                    } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                        return true;
                                    }
                                }
                            } else if (list.equals(abstractC9676i.mo18177b())) {
                                qosTier = this.f49540g;
                                if (qosTier == null) {
                                    if (abstractC9676i.mo18180e() == null) {
                                        return true;
                                    }
                                } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                    return true;
                                }
                            }
                        }
                    } else if (str.equals(abstractC9676i.mo18179d())) {
                        list = this.f49539f;
                        if (list == null) {
                            if (abstractC9676i.mo18177b() == null) {
                                qosTier = this.f49540g;
                                if (qosTier == null) {
                                    if (abstractC9676i.mo18180e() == null) {
                                        return true;
                                    }
                                } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                    return true;
                                }
                            }
                        } else if (list.equals(abstractC9676i.mo18177b())) {
                            qosTier = this.f49540g;
                            if (qosTier == null) {
                                if (abstractC9676i.mo18180e() == null) {
                                    return true;
                                }
                            } else if (qosTier.equals(abstractC9676i.mo18180e())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: f */
    public final long mo18181f() {
        return this.f49534a;
    }

    @Override // p432v8.AbstractC9676i
    /* JADX INFO: renamed from: g */
    public final long mo18182g() {
        return this.f49535b;
    }

    public final int hashCode() {
        long j10 = this.f49534a;
        long j11 = this.f49535b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int iHashCode = 0;
        ClientInfo clientInfo = this.f49536c;
        int iHashCode2 = (i10 ^ (clientInfo == null ? 0 : clientInfo.hashCode())) * 1000003;
        Integer num = this.f49537d;
        int iHashCode3 = (iHashCode2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f49538e;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC9675h> list = this.f49539f;
        int iHashCode5 = (iHashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        QosTier qosTier = this.f49540g;
        if (qosTier != null) {
            iHashCode = qosTier.hashCode();
        }
        return iHashCode5 ^ iHashCode;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f49534a + ", requestUptimeMs=" + this.f49535b + ", clientInfo=" + this.f49536c + ", logSource=" + this.f49537d + ", logSourceName=" + this.f49538e + ", logEvents=" + this.f49539f + ", qosTier=" + this.f49540g + "}";
    }
}

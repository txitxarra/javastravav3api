package javastrava.api.v3.model;

import javastrava.api.v3.model.reference.StravaResourceState;

/**
 * A zone e.g. for measuring athlete's heart rate zone
 *
 * @author DShannon
 *
 */
public class StravaZone implements StravaEntity<Integer> {
	/**
	 * Minimum value in a zone
	 */
	private Integer min;

	/**
	 * Maximum value in a zone
	 */
	private Integer max;

	/**
	 * No-args constructor
	 */
	public StravaZone() {
		super();
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final StravaZone other = (StravaZone) obj;
		if (this.max == null) {
			if (other.max != null) {
				return false;
			}
		} else if (!this.max.equals(other.max)) {
			return false;
		}
		if (this.min == null) {
			if (other.min != null) {
				return false;
			}
		} else if (!this.min.equals(other.min)) {
			return false;
		}
		return true;
	}

	/**
	 * @return maximum value in this zone
	 */
	public Integer getMax() {
		return this.max;
	}

	/**
	 * @return minimum value in this zone
	 */
	public Integer getMin() {
		return this.min;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((this.max == null) ? 0 : this.max.hashCode());
		result = (prime * result) + ((this.min == null) ? 0 : this.min.hashCode());
		return result;
	}

	/**
	 * @param max
	 *            maximum value in this zone
	 */
	public void setMax(final Integer max) {
		this.max = max;
	}

	/**
	 * @param min
	 *            minimum value in this zone
	 */
	public void setMin(final Integer min) {
		this.min = min;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StravaZone [min=" + this.min + ", max=" + this.max + "]"; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	}

	@Override
	public Integer getId() {
		return null;
	}

	@Override
	public StravaResourceState getResourceState() {
		return StravaResourceState.DETAILED;
	}

}
